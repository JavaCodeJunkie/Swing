package com.javacodejunkie;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame {

	private JFrame frame;
	private JPanel panel;

	public MainFrame() {
		initialize();
	}

	private void initialize() {

		frame = new JFrame();
		frame.setTitle("Java Code Junkie - Set Nimbus Look and Feel");

		panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));

		panel.add(new JLabel("Enter some text"));
		panel.add(new JTextField(15));
		panel.add(new JButton("Click"));

		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);

		frame.add(panel, BorderLayout.CENTER);

		frame.setVisible(true);
	}
}
