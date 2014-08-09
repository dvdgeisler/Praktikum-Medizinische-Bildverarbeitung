package de.uni_tuebingen.gris.pmb.module.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import de.uni_tuebingen.gris.pmb.module.IModule;

public class ModuleDebugEvenListPanel extends JPanel implements MouseListener {

	private static final long serialVersionUID = -5452058813967849784L;
	
	private final ModuleDebugFrame<? extends IModule> frame;

	{
		this.setPreferredSize(new Dimension(400, 50));
		this.setMinimumSize(this.getPreferredSize());
	}

	public ModuleDebugEvenListPanel(ModuleDebugFrame<? extends IModule> frame) {
		super();
		GridLayout layout;
		this.frame = frame;
		
		layout = new GridLayout(1, 0);
		this.setLayout(layout);
	}

	@Override
	public void paint(Graphics g) {
		int width, iwidth;
		super.paint(g);
		
		width = 0;

		for(	ModuleDebugFrame.ModulePerformedEventContainer event : 
				new ArrayList<ModuleDebugFrame.ModulePerformedEventContainer>(this.getFrame().getEventChain())) {
			iwidth = event.getScaledImage().getWidth(null);
			g.drawImage(event.getScaledImage(), width, 0, null);
			g.setColor(new Color(0f, 0f, 0f, 0.5f));
			g.fillRect(width, 40, iwidth, 10);
			g.setColor(Color.WHITE);
			g.setFont(new Font("Arial", Font.BOLD, 8));
			g.drawString(String.format("%d", event.getTime()), width + 2, 48);
			width += iwidth;
			if(width > this.getWidth())
				break;
		}
		
	}

	public void refresh() {
		this.repaint();
	}

	public ModuleDebugFrame<? extends IModule> getFrame() {
		return this.frame;
	}

	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		if(enabled)
			this.addMouseListener(this);
		else {
			this.removeMouseListener(this);
			this.getFrame().setCurrentFrame(null);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int width, iwidth;
		width = 0;
		for(	ModuleDebugFrame.ModulePerformedEventContainer event : 
			new ArrayList<ModuleDebugFrame.ModulePerformedEventContainer>(this.getFrame().getEventChain())) {
			iwidth = event.getScaledImage().getWidth(null);
			if(width < e.getX() && e.getX() < width + iwidth) {
				this.getFrame().setCurrentFrame(event);
				break;
			}
			width += iwidth;
		}
	}

	@Override
	public void mousePressed(MouseEvent e) { }

	@Override
	public void mouseReleased(MouseEvent e) { }

	@Override
	public void mouseEntered(MouseEvent e) { }

	@Override
	public void mouseExited(MouseEvent e) { }

}
