package de.uni_tuebingen.gris.pmb.module.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Scalar;

import de.uni_tuebingen.gris.pmb.module.IModulePerformedEvent;
import de.uni_tuebingen.gris.pmb.module.ModuleOpticalFlowLK;

public class ModuleOpticalFlowLKDebugGUI extends ModuleDebugFrame<ModuleOpticalFlowLK> {

	private static final long serialVersionUID = 5050514185808069350L;

	public ModuleOpticalFlowLKDebugGUI(ModuleOpticalFlowLK module) {
		super(module);
	}

	@Override
	public void drawImageDetails(Graphics g, IModulePerformedEvent event) {
		MatOfPoint2f featurePoints, motion;
		MatOfFloat err;
		Graphics2D g2;
		Scalar maxErr;
		
		g2 = (Graphics2D) g;
		featurePoints = (MatOfPoint2f) event.getImage().getAnnotation("optical_flow_features");
		motion = (MatOfPoint2f) event.getImage().getAnnotation("optical_flow_features_motion");
		err = (MatOfFloat) event.getImage().getAnnotation("optival_flow_features_error");
		maxErr = (Scalar) event.getImage().getAnnotation("optical_flow_max_error");
		
		g2.setColor(Color.green);
		g2.setStroke(new BasicStroke(3f));
		
		for(int i = 0; i < featurePoints.rows(); i++) {
			double[] f;
			double[] m;
			double[] e;
			float p;
			
			f = featurePoints.get(i, 0);
			m = motion.get(i, 0);
			e = err.get(i, 0);
			p = (float) (e[0]/maxErr.val[0]);
			
			g2.setColor(new Color(p, 1f-p, 0));
			g2.drawOval((int)f[0]-15, (int)f[1]-15, 30, 30);
			g2.drawLine((int)f[0], (int)f[1], (int)(f[0]-m[0]), (int)(f[1]-m[1]));
			g2.drawString(String.format("%.2f", e[0]), (int)f[0]+15, (int)f[1]-15);
		}
	}

	@Override
	public Component getEventDetails(IModulePerformedEvent event) {
		JPanel panel;
		GridBagLayout layout;
		final Scalar minMotion, maxMotion, meanMotion;
		final Scalar minError,  maxError,  meanError;
		final Scalar minDistance, maxDistance, meanDistance;
		
		panel = new JPanel();
		layout = new GridBagLayout();

		meanMotion = (Scalar) event.getImage().getAnnotation("optical_flow_mean_motion");
		meanError = (Scalar) event.getImage().getAnnotation("optical_flow_mean_error");
		meanDistance = (Scalar) event.getImage().getAnnotation("optical_flow_mean_distance");
		
		minMotion = (Scalar) event.getImage().getAnnotation("optical_flow_min_motion");
		minError = (Scalar) event.getImage().getAnnotation("optical_flow_min_error");
		minDistance = (Scalar) event.getImage().getAnnotation("optical_flow_min_distance");
		
		maxMotion = (Scalar) event.getImage().getAnnotation("optical_flow_max_motion");
		maxError = (Scalar) event.getImage().getAnnotation("optical_flow_max_error");
		maxDistance = (Scalar) event.getImage().getAnnotation("optical_flow_max_distance");
		
		panel.setLayout(layout);
		
		panel.add(new JLabel("mean motion:"),new GridBagConstraints(
				0, 0,
				1, 1,
				0, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f X %.2f", meanMotion.val[0], meanMotion.val[1])),new GridBagConstraints(
				1, 0,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JLabel("mean distance:"),new GridBagConstraints(
				0, 1,
				1, 1,
				0, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", meanDistance.val[0])),new GridBagConstraints(
				1, 1,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JLabel("mean error:"),new GridBagConstraints(
				0, 2,
				1, 1,
				0, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", meanError.val[0])),new GridBagConstraints(
				1, 2,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JLabel("min motion:"),new GridBagConstraints(
				0, 3,
				1, 1,
				0, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f X %.2f", minMotion.val[0], minMotion.val[1])),new GridBagConstraints(
				1, 3,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JLabel("min distance:"),new GridBagConstraints(
				0, 4,
				1, 1,
				0, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", minDistance.val[0])),new GridBagConstraints(
				1, 4,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JLabel("min error:"),new GridBagConstraints(
				0, 5,
				1, 1,
				0, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", minError.val[0])),new GridBagConstraints(
				1, 5,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JLabel("max motion:"),new GridBagConstraints(
				0, 6,
				1, 1,
				0, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f X %.2f", maxMotion.val[0], maxMotion.val[1])),new GridBagConstraints(
				1, 6,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JLabel("max distance:"),new GridBagConstraints(
				0, 7,
				1, 1,
				0, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", maxDistance.val[0])),new GridBagConstraints(
				1, 7,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JLabel("max error:"),new GridBagConstraints(
				0, 8,
				1, 1,
				0, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JTextField(String.format("%.2f", maxError.val[0])),new GridBagConstraints(
				1, 8,
				1, 1,
				1, 0,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		panel.add(new JPanel() {
			private static final long serialVersionUID = -3541191649675859568L;
			{
				this.setBackground(Color.white);
			}
			@Override
			public void paint(Graphics g) {
				int cx, cy, tx, ty;
				Graphics2D g2;
				GeneralPath path;
				double xPathScale, yPathScale;
				
				super.paint(g);
				
				cx = this.getWidth()/2;
				cy = this.getHeight()/2;
				tx = (int)(cx+meanMotion.val[0]);
				ty = (int)(cy+meanMotion.val[1]);
				g2 = (Graphics2D) g;

				g2.setStroke(new BasicStroke(1f));
				g2.setColor(Color.green);
				g2.drawLine(cx, cy, tx, ty);
				g2.setColor(Color.red);
				g2.drawOval((int)(tx - meanError.val[0]/2), (int)(ty - meanError.val[0]/2), (int)meanError.val[0], (int)meanError.val[0]);

				g2.setColor(Color.green);
				path = new GeneralPath();
				path.moveTo(0, 0);
				for(Scalar s : ModuleOpticalFlowLKDebugGUI.this.getModule().getPosition()) {
					path.lineTo(-s.val[0], -s.val[1]);
				}
				path.transform(
						AffineTransform.getTranslateInstance(
								-path.getBounds().getX(),
								-path.getBounds().getY()));

				xPathScale = (double)(this.getWidth()-40) / path.getBounds().getWidth();
				yPathScale = (double)(this.getHeight()-40) / path.getBounds().getHeight();
				if(xPathScale < yPathScale)
					yPathScale = xPathScale;
				else
					xPathScale = yPathScale;
				
				path.transform(AffineTransform.getScaleInstance(xPathScale, yPathScale));
				path.transform(
						AffineTransform.getTranslateInstance(
								20,
								20));
				g2.draw(path);
			}
		},new GridBagConstraints(
				0, 10,
				2, 1,
				1, 1,
				GridBagConstraints.CENTER,
				GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2),
				0, 0));
		
		return panel;
	}

	
}
