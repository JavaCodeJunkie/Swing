package com.javacodejunkie;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameOne extends JFrame {
	
	private static final long serialVersionUID = -1763373207830656802L;

	public JFrameOne() {
		super();
		initialize();
	}

	private void initialize() {
		setTitle("JFrameOne");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		ImageIcon icon = new ImageIcon("logo.png");
		setIconImage(icon.getImage());
	}

	public void showWindow() {
		setVisible(true);
	}
}
