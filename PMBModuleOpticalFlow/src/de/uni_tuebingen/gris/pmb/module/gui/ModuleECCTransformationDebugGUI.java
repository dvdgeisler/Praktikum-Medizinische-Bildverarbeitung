package de.uni_tuebingen.gris.pmb.module.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.opencv.core.Mat;

import de.uni_tuebingen.gris.pmb.module.IModulePerformedEvent;
import de.uni_tuebingen.gris.pmb.module.ModuleECCTransform;

public class ModuleECCTransformationDebugGUI extends ModuleDebugFrame<ModuleECCTransform> {

	private static final long serialVersionUID = 5050514185808069350L;
	private static final Area area = new Area();

	public ModuleECCTransformationDebugGUI(ModuleECCTransform moduleECCTransform) {
		super(moduleECCTransform);
	}

	@Override
	public void drawImageDetails(Graphics g, IModulePerformedEvent event) {
		
	}

	@Override
	public Component getEventDetails(IModulePerformedEvent event) {
		JPanel panel;
		GridBagLayout layout;
		Mat localTransform;
		final Mat globalTransform;
		
		panel = new JPanel();
		layout = new GridBagLayout();

		localTransform = (Mat) event.getImage().getAnnotation("optical_flow_local_transform");
		globalTransform = (Mat) event.getImage().getAnnotation("optical_flow_global_transform");
		
		panel.setLayout(layout);
		
		panel.add(new JLabel("local:"),new GridBagConstraints(
				0, 0,
				1, 1,
				0, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", localTransform.get(0, 0)[0])),new GridBagConstraints(
				1, 0,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", localTransform.get(0, 1)[0])),new GridBagConstraints(
				2, 0,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", localTransform.get(0, 2)[0])),new GridBagConstraints(
				3, 0,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", localTransform.get(1, 0)[0])),new GridBagConstraints(
				1, 1,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", localTransform.get(1, 1)[0])),new GridBagConstraints(
				2, 1,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", localTransform.get(1, 2)[0])),new GridBagConstraints(
				3, 1,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JLabel("global:"),new GridBagConstraints(
				0, 2,
				1, 1,
				0, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", globalTransform.get(0, 0)[0])),new GridBagConstraints(
				1, 2,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", globalTransform.get(0, 1)[0])),new GridBagConstraints(
				2, 2,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", globalTransform.get(0, 2)[0])),new GridBagConstraints(
				3, 2,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", globalTransform.get(1, 0)[0])),new GridBagConstraints(
				1, 3,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", globalTransform.get(1, 1)[0])),new GridBagConstraints(
				2, 3,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", globalTransform.get(1, 2)[0])),new GridBagConstraints(
				3, 3,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JPanel() {

			private static final long serialVersionUID = 1L;

			@Override
			public void paint(Graphics gg) {
				Graphics2D g;
				Area a;
				int w, h;
				
				g = (Graphics2D) gg;
				w = this.getWidth()-2;
				h = this.getHeight()-2;
				super.paint(g);
				
				AffineTransform t;
				Shape rectangle;
				t = new AffineTransform(
				globalTransform.get(0, 0)[0], globalTransform.get(1, 0)[0], globalTransform.get(0, 1)[0],
				globalTransform.get(1, 1)[0], globalTransform.get(0, 2)[0], globalTransform.get(1, 2)[0]);
		
				rectangle = t.createTransformedShape(new Rectangle(0,0,1920,1088));
				area.add(new Area(rectangle));
				
				a = (Area) area.clone();
				a.transform(AffineTransform.getScaleInstance(-1, -1));
				a.transform(AffineTransform.getTranslateInstance(-a.getBounds().getX(), -a.getBounds().getY()));
				if(a.getBounds().getWidth()> w)
					a.transform(AffineTransform.getScaleInstance(w/a.getBounds().getWidth(), w/a.getBounds().getWidth()));
				if(a.getBounds().getHeight()> h)
					a.transform(AffineTransform.getScaleInstance(h/a.getBounds().getHeight(), h/a.getBounds().getHeight()));
				
				g.setBackground(Color.white);
				g.setColor(Color.lightGray);
				g.fill(a);
				g.setColor(Color.darkGray);
				g.draw(a);
			}
			
		},new GridBagConstraints(
				0, 4,
				4, 1,
				1, 1,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		return panel;
	}

	
}
