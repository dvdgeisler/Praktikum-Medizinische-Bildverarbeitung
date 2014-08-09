package de.uni_tuebingen.gris.pmb.module.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import de.uni_tuebingen.gris.pmb.module.IModule;

public class ModuleDebugEvenDetailsPanel extends JPanel {

	private static final long serialVersionUID = -1629393340941486059L;
	
	private final ModuleDebugFrame<? extends IModule> frame;
	
	private final JPanel videoDetailsPanel;
	private final JTextField moduleNameTextField;
	private final JTextField frameRateTextField;
	private final JTextField framesCountTextField;
	
	private final JPanel frameDetailsPanel;
	private final JTextField frameCountTextField;
	private final JTextField frameTimeTextField;
	
	private final JPanel processDetailsPanel;

	public ModuleDebugEvenDetailsPanel(ModuleDebugFrame<? extends IModule> frame) {
		GridBagLayout layout;
		
		this.frame = frame;
		this.videoDetailsPanel = new JPanel();
		this.frameDetailsPanel = new JPanel();
		this.processDetailsPanel = new JPanel();
		this.moduleNameTextField = new JTextField();
		this.frameRateTextField = new JTextField();
		this.frameCountTextField = new JTextField();
		this.framesCountTextField = new JTextField();
		this.frameTimeTextField = new JTextField();
		
		layout = new GridBagLayout();
		
		this.setPreferredSize(new Dimension(300, 400));
		this.setMinimumSize(this.getPreferredSize());
		this.setLayout(layout);
		this.getVideoDetailsPanel().setBorder(BorderFactory.createTitledBorder("Video"));
		this.getFrameDetailsPanel().setBorder(BorderFactory.createTitledBorder("Frame"));
		this.getProcessDetailsPanel().setBorder(BorderFactory.createTitledBorder("Process"));
		this.add(this.getVideoDetailsPanel(), new GridBagConstraints(
				0, 0,
				1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		this.add(this.getFrameDetailsPanel(), new GridBagConstraints(
				0, 1,
				1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		this.add(this.getProcessDetailsPanel(), new GridBagConstraints(
				0, 2,
				1, 1,
				1.0, 1.0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		this.getVideoDetailsPanel().setLayout(new GridLayout(0, 2));
		this.getVideoDetailsPanel().add(new JLabel("Module:"));
		this.getVideoDetailsPanel().add(this.getModuleNameTextField());
		this.getVideoDetailsPanel().add(new JLabel("FPS:"));
		this.getVideoDetailsPanel().add(this.getFrameRateTextField());
		this.getVideoDetailsPanel().add(new JLabel("Count:"));
		this.getVideoDetailsPanel().add(this.getFramesCountTextField());
		
		this.getFrameDetailsPanel().setLayout(new GridLayout(0, 2));
		this.getFrameDetailsPanel().add(new JLabel("Frame:"));
		this.getFrameDetailsPanel().add(this.getFrameCountTextField());
		this.getFrameDetailsPanel().add(new JLabel("Time:"));
		this.getFrameDetailsPanel().add(this.getFrameTimeTextField());

		this.getModuleNameTextField().setEditable(false);
		this.getFrameRateTextField().setEditable(false);
		this.getFramesCountTextField().setEditable(false);
		this.getFrameCountTextField().setEditable(false);
		this.getFrameTimeTextField().setEditable(false);
		
		this.getProcessDetailsPanel().setLayout(new GridLayout(1, 1));
	}

	public void refresh() {
		this.getProcessDetailsPanel().removeAll();
		this.getModuleNameTextField().setText(this.getFrame().getModule().getClass().getSimpleName());
		this.getFrameRateTextField().setText(String.format("%.4f", this.getFrame().getEventsPerSecond()));
		this.getFramesCountTextField().setText(String.format("%d",this.getFrame().getEventCounter()));
		if(this.getFrame().getCurrentFrame() != null) {
			this.getFrameCountTextField().setText(String.format("%d",this.getFrame().getCurrentFrame().getFrameCount()));
			this.getFrameTimeTextField().setText(String.format("%d", this.getFrame().getCurrentFrame().getTime()));
			this.getProcessDetailsPanel().add(this.getFrame().getCurrentFrame().getProcessDetailsPanel());
		}
		this.revalidate();
	}

	public ModuleDebugFrame<? extends IModule> getFrame() {
		return this.frame;
	}

	public JPanel getVideoDetailsPanel() {
		return this.videoDetailsPanel;
	}

	public JTextField getModuleNameTextField() {
		return this.moduleNameTextField;
	}

	public JTextField getFrameRateTextField() {
		return this.frameRateTextField;
	}

	public JTextField getFramesCountTextField() {
		return this.framesCountTextField;
	}

	public JPanel getFrameDetailsPanel() {
		return this.frameDetailsPanel;
	}

	public JTextField getFrameCountTextField() {
		return this.frameCountTextField;
	}

	public JTextField getFrameTimeTextField() {
		return this.frameTimeTextField;
	}

	public JPanel getProcessDetailsPanel() {
		return this.processDetailsPanel;
	}

}
