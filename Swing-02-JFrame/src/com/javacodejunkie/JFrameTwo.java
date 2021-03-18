package com.javacodejunkie;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameTwo {

	private JFrame frame;

	public JFrameTwo() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		this.frame.setTitle("JFrameTwo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(500, 400);
		this.frame.setLocationRelativeTo(null);
		this.frame.setResizable(false);
		ImageIcon icon = new ImageIcon("logo.png");
		this.frame.setIconImage(icon.getImage());
	}

	public void show() {
		this.frame.setVisible(true);
	}
}
