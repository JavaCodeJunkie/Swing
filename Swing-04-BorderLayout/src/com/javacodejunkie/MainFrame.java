package com.javacodejunkie;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame {

	private JFrame frame;

	public MainFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("BorderLayout Demo");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setHgap(10);
		borderLayout.setVgap(10);
		frame.setLayout(borderLayout);
		
		frame.add(new JButton("NORTH"), BorderLayout.NORTH);
		frame.add(new JButton("WEST"), BorderLayout.WEST);
		frame.add(new JButton("EAST"), BorderLayout.EAST);
		frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		frame.add(new JButton("CENTER"), BorderLayout.CENTER);
		
		frame.setLocationRelativeTo(null);
	}

	public void show() {
		this.frame.setVisible(true);
	}
}
