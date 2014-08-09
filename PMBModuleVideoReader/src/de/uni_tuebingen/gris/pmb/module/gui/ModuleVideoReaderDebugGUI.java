package de.uni_tuebingen.gris.pmb.module.gui;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JPanel;

import de.uni_tuebingen.gris.pmb.module.IModulePerformedEvent;
import de.uni_tuebingen.gris.pmb.module.ModuleVideoReader;

public class ModuleVideoReaderDebugGUI extends ModuleDebugFrame<ModuleVideoReader> {

	public ModuleVideoReaderDebugGUI(ModuleVideoReader module) {
		super(module);
	}

	private static final long serialVersionUID = -4457106197751533997L;

	@Override
	public void drawImageDetails(Graphics g, IModulePerformedEvent event) {
		
	}

	@Override
	public Component getEventDetails(IModulePerformedEvent event) {
		// TODO Auto-generated method stub
		return new JPanel();
	}
	
}
