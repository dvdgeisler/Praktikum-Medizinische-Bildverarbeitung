package de.uni_tuebingen.gris.pmb.module.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

import org.opencv.core.MatOfByte;
import org.opencv.highgui.Highgui;

import de.uni_tuebingen.gris.pmb.module.IModule;
import de.uni_tuebingen.gris.pmb.module.IModuleDeinitializedEvent;
import de.uni_tuebingen.gris.pmb.module.IModuleInitializedEvent;
import de.uni_tuebingen.gris.pmb.module.IModuleListener;
import de.uni_tuebingen.gris.pmb.module.IModulePerformedEvent;
import de.uni_tuebingen.gris.pmb.module.ModulePerformedEvent;
import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public abstract class ModuleDebugFrame<T extends IModule> extends JFrame implements IModuleListener {

	private static final long serialVersionUID = -4296418018962199465L;
	
	public class ModulePerformedEventContainer extends ModulePerformedEvent {
		
		private final long time;
		private final Image fullImage;
		private final Image scaledImage;
		private final float fps;
		private final int count;
		private final Component details;

		public ModulePerformedEventContainer(IModulePerformedEvent event, long time, float fps, int count) {
			super(event);
			MatOfByte matBytes;
			BufferedImage fullImage;
			Image scaledImage;
			
			this.fps = fps;
			this.time = time;			
			fullImage = null;
			scaledImage = null;
			matBytes = new MatOfByte();
			Highgui.imencode(".jpg", this.getImage().getData(), matBytes);
			try {
				fullImage = ImageIO.read(new ByteArrayInputStream(matBytes.toArray()));
				scaledImage = fullImage.getScaledInstance(
								(int) (fullImage.getWidth(null)*(50d/fullImage.getHeight(null))), 50, Image.SCALE_FAST);
				ModuleDebugFrame.this.drawImageDetails(fullImage.getGraphics(),event);
			} catch (IOException e) {
				e.printStackTrace();
			}
			this.fullImage = fullImage;
			this.scaledImage = scaledImage;
			this.count = count;
			this.details = ModuleDebugFrame.this.getEventDetails(event);
		}

		public long getTime() {
			return this.time;
		}

		public Image getFullImage() {
			return this.fullImage;
		}

		public Image getScaledImage() {
			return this.scaledImage;
		}

		public float getFps() {
			return this.fps;
		}

		public Object getFrameCount() {
			return this.count;
		}

		public Component getProcessDetailsPanel() {
			return this.details;
		}
		
	}
	
	private final ModuleDebugEvenDetailsPanel evenDetailsPanel;
	private final ModuleDebugEventPreviewPanel eventPreviewPanel;
	private final ModuleDebugEvenListPanel eventListPanel;
	private final JToggleButton pauseToggleButton;
	private final T module;
	private final LinkedList<ModulePerformedEventContainer> eventChain;
	private int eventChainMaxSize;
	private int eventCounter;
	private ModulePerformedEventContainer currentFrame;
	
	{
		this.eventChainMaxSize = 50;
		this.eventChain = new LinkedList<ModulePerformedEventContainer>();
		this.eventCounter = 0;
		this.evenDetailsPanel = new ModuleDebugEvenDetailsPanel(this);
		this.eventListPanel = new ModuleDebugEvenListPanel(this);
		this.eventPreviewPanel = new ModuleDebugEventPreviewPanel(this);
		this.pauseToggleButton = new JToggleButton(">",false);
	}
	
	protected ModuleDebugFrame(T module) {
		GridBagLayout gridBagLayout;
		
		this.module = module;
		this.getModule().getObserver().addListener(this);
		

		this.getEventListPanel().setEnabled(false);
		this.getPauseToggleButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ModuleDebugFrame.this.getEventListPanel().setEnabled(!((JToggleButton)e.getSource()).isSelected());
			}
		});
		this.getPauseToggleButton().setPreferredSize(new Dimension(50, 50));
		this.getPauseToggleButton().setMinimumSize(this.getPauseToggleButton().getPreferredSize());
		gridBagLayout = new GridBagLayout();
		this.getContentPane().setLayout(gridBagLayout);
		this.getContentPane().add(
				this.getEventPreviewPanel(), 
				new GridBagConstraints(
						0, 0, 
						2, 1, 
						1.0, 1.0, 
						GridBagConstraints.CENTER, 
						GridBagConstraints.BOTH, 
						new Insets(2, 2, 2, 2), 
						0, 0));
		this.getContentPane().add(
				this.getEventListPanel(), 
				new GridBagConstraints(
						0, 1, 
						1, 1, 
						1.0, 0.0, 
						GridBagConstraints.CENTER, 
						GridBagConstraints.BOTH, 
						new Insets(2, 2, 2, 2), 
						0, 0));
		this.getContentPane().add(
				this.getPauseToggleButton(), 
				new GridBagConstraints(
						1, 1, 
						1, 1, 
						0.0, 0.0, 
						GridBagConstraints.CENTER, 
						GridBagConstraints.BOTH, 
						new Insets(2, 2, 2, 2), 
						0, 0));
		this.getContentPane().add(
				this.getEvenDetailsPanel(), 
				new GridBagConstraints(
						2, 0, 
						1, 2, 
						0.0, 1.0, 
						GridBagConstraints.CENTER, 
						GridBagConstraints.BOTH, 
						new Insets(2, 2, 2, 2), 
						0, 0));
		
		this.setPreferredSize(new Dimension(800, 400));
		this.setSize(this.getPreferredSize());
	}

	public abstract Component getEventDetails(IModulePerformedEvent event);

	public abstract void drawImageDetails(Graphics graphics, IModulePerformedEvent event);

	public T getModule() {
		return this.module;
	}

	public LinkedList<ModulePerformedEventContainer> getEventChain() {
		return this.eventChain;
	}

	public int getEventChainMaxSize() {
		return this.eventChainMaxSize;
	}

	public void setEventChainMaxSize(int eventChainMaxSize) {
		this.eventChainMaxSize = eventChainMaxSize;
	}
	
	public int getEventCounter() {
		return this.eventCounter;
	}

	public void setEventCounter(int eventCounter) {
		this.eventCounter = eventCounter;
	}
	
	public float getEventsPerSecond() {
		if(this.getEventChain().size() == 0)
			return 0;
		return  this.getEventChain().size() * 1000f /
				( this.getEventChain().getFirst().getTime() - 
				  this.getEventChain().getLast().getTime() );
	}

	private void pushEvent(IModulePerformedEvent event) {
		this.getEventChain().addFirst(new ModulePerformedEventContainer(event, System.currentTimeMillis(), this.getEventsPerSecond(), this.getEventCounter()+1));
	}

	public ModuleDebugEvenDetailsPanel getEvenDetailsPanel() {
		return this.evenDetailsPanel;
	}

	public ModuleDebugEventPreviewPanel getEventPreviewPanel() {
		return this.eventPreviewPanel;
	}

	public ModuleDebugEvenListPanel getEventListPanel() {
		return this.eventListPanel;
	}

	public JToggleButton getPauseToggleButton() {
		return this.pauseToggleButton;
	}

	protected void onModulePerformed() {
		this.getEventListPanel().refresh();
		this.getEventPreviewPanel().refresh();
		this.getEvenDetailsPanel().refresh();
		
		this.revalidate();
	}

	@Override
	public void onEventRaised(IEvent<IModuleListener> event) { }

	@Override
	public void onModulePerformed(IModulePerformedEvent event) {
		while(!this.getPauseToggleButton().isSelected())
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.pushEvent(event);
		if(this.getEventChain().size() > this.getEventChainMaxSize())
			this.getEventChain().removeLast();
		this.setEventCounter(this.getEventCounter()+1);
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ModuleDebugFrame.this.onModulePerformed();
			}
		});
	}

	@Override
	public void onModuleInitialized(IModuleInitializedEvent event) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ModuleDebugFrame.this.setVisible(true);
			}
		});
	}

	@Override
	public void onModuleDeinitialized(IModuleDeinitializedEvent event) {
		this.getModule().getObserver().removeListener(this);
		this.setVisible(false);
	}

	public ModulePerformedEventContainer getCurrentFrame() {
		if(this.currentFrame == null && this.getEventChain().size() > 0)
			return this.getEventChain().getFirst();
		return this.currentFrame;
	}

	public void setCurrentFrame(ModulePerformedEventContainer currentFrame) {
		this.currentFrame = currentFrame;
		this.onModulePerformed();
	}

}
