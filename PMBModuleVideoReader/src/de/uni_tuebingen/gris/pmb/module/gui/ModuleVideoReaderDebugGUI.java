package de.uni_tuebingen.gris.pmb.module.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.ByteArrayInputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import org.opencv.core.MatOfByte;
import org.opencv.highgui.Highgui;

import de.uni_tuebingen.gris.pmb.data.DefaultImage;
import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.module.IModuleDeinitializedEvent;
import de.uni_tuebingen.gris.pmb.module.IModuleInitializedEvent;
import de.uni_tuebingen.gris.pmb.module.IModuleListener;
import de.uni_tuebingen.gris.pmb.module.IModulePerformedEvent;
import de.uni_tuebingen.gris.pmb.module.ModuleVideoReader;
import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public class ModuleVideoReaderDebugGUI extends JFrame implements IModuleListener {

	private static final long serialVersionUID = -4457106197751533997L;
	
	private final ModuleVideoReader module;
	private IImage image;
	private long lastImageProcessesTime;
	private long lastImageProcessesTimeDiff;
	private int time;
	
	{
		this.image = null;
		this.lastImageProcessesTime = System.currentTimeMillis();
		this.lastImageProcessesTimeDiff = 1;
		this.time = 0;
	}

	public ModuleVideoReaderDebugGUI(ModuleVideoReader module) {
		this.module = module;
		this.getModule().getObserver().addListener(this);
		this.setSize(600, 400);
		this.getContentPane().add(new JScrollPane(new JPanel() {

			private static final long serialVersionUID = 2902696473177406252L;
			
			{
				this.setSize(1000, 1000);
			}
			
			private Image getImage() {
				IImage img;
				MatOfByte byteMat;

				
				try {
					img = ModuleVideoReaderDebugGUI.this.getImage();
					byteMat = new MatOfByte();
					Highgui.imencode(".jpg", img.getData(), byteMat);
					return ImageIO.read(new ByteArrayInputStream(byteMat.toArray()));
				} catch (Exception e) {
					return null;
				}
			}

			@Override
			public void paint(Graphics g) {
				Image img;
				
				super.paint(g);
				
				img = this.getImage();
				
				if(img == null)
					return;
				
				g.drawImage(img, 0, 0, null);
				this.setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
				this.setSize(img.getWidth(null), img.getHeight(null));
			}
			
		}),BorderLayout.CENTER);
		
		this.setTitle("ModuleVideoReader: " + this.getModule().getConfiguration().getString(ModuleVideoReader.CONFIGURATION_KEY_IMAGE_SOURCE));
	}

	@Override
	public void paint(Graphics g) {
		int width, height, offsetx, offsety;
		
		super.paint(g);
		
		width = 100;
		height = 70;
		offsetx = 25;
		offsety = 25;
		
		g.setColor(new Color(0, 0, 0, 128));
		g.fillRect(
				(int)this.getSize().getWidth() - width - offsetx, 
				(int)this.getSize().getHeight() - height - offsety, 
				width, height);
		g.setColor(new Color(1.0f, 1.0f, 1.0f));
		g.drawRect(
				(int)this.getSize().getWidth() - width - offsetx, 
				(int)this.getSize().getHeight() - height - offsety, 
				width, height);
		g.drawString(
				String.format("%.2f FPS", 1000d / this.getLastImageProcessesTimeDiff()),
				(int)this.getSize().getWidth() - width - offsetx + 5, 
				(int)this.getSize().getHeight() - height - offsety + 15);
		g.drawString(
				String.format("Time: %d", this.getTime()),
				(int)this.getSize().getWidth() - width - offsetx + 5, 
				(int)this.getSize().getHeight() - height - offsety + 30);
		g.drawString(
				String.format("Width: %d", this.getImage().getData().width()),
				(int)this.getSize().getWidth() - width - offsetx + 5, 
				(int)this.getSize().getHeight() - height - offsety + 45);
		g.drawString(
				String.format("Height: %d", this.getImage().getData().height()),
				(int)this.getSize().getWidth() - width - offsetx + 5, 
				(int)this.getSize().getHeight() - height - offsety + 60);
	}

	public int getTime() {
		return this.time;
	}

	public void incTime() {
		this.time++;
	}

	public ModuleVideoReader getModule() {
		return this.module;
	}

	public IImage getImage() {
		return this.image;
	}

	public void setImage(IImage image) {
		this.image = image;
	}

	public long getLastImageProcessesTime() {
		return this.lastImageProcessesTime;
	}

	public void setLastImageProcessesTime(long lastImageProcessesTime) {
		this.lastImageProcessesTime = lastImageProcessesTime;
	}

	public long getLastImageProcessesTimeDiff() {
		return this.lastImageProcessesTimeDiff;
	}

	public void setLastImageProcessesTimeDiff(long lastImageProcessesTimeDiff) {
		this.lastImageProcessesTimeDiff = lastImageProcessesTimeDiff;
	}

	@Override
	public void onEventRaised(IEvent<IModuleListener> event) { }

	@Override
	public void onModulePerformed(IModulePerformedEvent event) {
		long lastImageProcessesTime;
		
		lastImageProcessesTime = System.currentTimeMillis();
		this.setImage(event.getImage());
		this.setLastImageProcessesTimeDiff(lastImageProcessesTime - this.getLastImageProcessesTime());
		this.setLastImageProcessesTime(lastImageProcessesTime);
		this.incTime();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ModuleVideoReaderDebugGUI.this.repaint();
			}
		});
	}

	@Override
	public void onModuleInitialized(IModuleInitializedEvent event) {
		this.setImage(new DefaultImage());
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ModuleVideoReaderDebugGUI.this.setVisible(true);
			}
		});
	}

	@Override
	public void onModuleDeinitialized(IModuleDeinitializedEvent event) {
		this.getModule().getObserver().removeListener(this);
		this.setVisible(false);
	}
	
	
}
