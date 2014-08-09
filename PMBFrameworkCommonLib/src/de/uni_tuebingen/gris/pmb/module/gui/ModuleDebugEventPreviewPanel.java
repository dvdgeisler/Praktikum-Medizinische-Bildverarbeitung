package de.uni_tuebingen.gris.pmb.module.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

import de.uni_tuebingen.gris.pmb.module.IModule;

public class ModuleDebugEventPreviewPanel extends JPanel {

	private static final long serialVersionUID = 8617273054422588799L;
	
	private final ModuleDebugFrame<? extends IModule> frame;

	{
		this.setPreferredSize(new Dimension(400, 500));
	}

	public ModuleDebugEventPreviewPanel(ModuleDebugFrame<? extends IModule> frame) {
		this.frame = frame;
	}
	
	@Override
	public void paint(Graphics g) {
		double width, height, xScale, yScale;
		int iwidth, iheight, x, y;
		ModuleDebugFrame.ModulePerformedEventContainer event;
		super.paint(g);
		
		event = this.getFrame().getCurrentFrame();
		if(event == null)
			return;
		
		width = event.getFullImage().getWidth(null);
		height = event.getFullImage().getHeight(null);
		xScale = this.getWidth() / width;
		yScale = this.getHeight() / height;
		
		if(xScale < yScale)
			yScale = xScale;
		else
			xScale = yScale;
		
		iwidth = (int) (width * xScale);
		iheight = (int) (height * yScale);
		x = (this.getWidth() - iwidth)/2;
		y = (this.getHeight() - iheight)/2;

		g.drawImage(event.getFullImage().getScaledInstance(iwidth, iheight, Image.SCALE_SMOOTH), x, y, null);
	}
	
	public void refresh() {
		this.repaint();
	}

	public ModuleDebugFrame<? extends IModule> getFrame() {
		return this.frame;
	}
}
