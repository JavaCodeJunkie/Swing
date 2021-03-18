package com.javacodejunkie;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainFrame {

	private JFrame frame;

	public MainFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("JPanel Demo");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLayout(new BorderLayout(10, 10));
		frame.setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("logo.png");
		frame.setIconImage(icon.getImage());
	}

	public void show() {
		this.frame.setVisible(true);
	}
}
