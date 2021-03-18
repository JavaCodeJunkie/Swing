package com.javacodejunkie;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {

	private JFrame frame;
	private JPanel panel;

	public MainFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("GridLayout Demo");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);

		panel = new JPanel(new GridLayout(5, 0, 10, 10));
		
		for (int i = 1; i <= 30; i++) {
			JButton button = new JButton("Button " + Integer.toString(i));
			panel.add(button);
		}
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}
