package com.javacodejunkie;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class MainFrame {

	private JFrame frame;
	private JPanel panel;

	public MainFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("MigLayout Demo");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);

		JPanel panel = new JPanel(new MigLayout());
		
//		MigLayout layout = new MigLayout("insets 10, wrap, fill", "[][][]", "[][][]");
//
//		panel = new JPanel();
//
//		panel.add(new JButton("Button 1"));
//		panel.add(new JButton("Button 2"));
//		panel.add(new JButton("Button 3"));
//		panel.add(new JButton("Button 4"));
//		panel.add(new JButton("Button 5"));
//		panel.add(new JButton("Button 6"));
//		panel.add(new JButton("Button 7"));
//		panel.add(new JButton("Button 8"));
//		panel.add(new JButton("Button 9"));

		JLabel firstNameLabel = new JLabel("First Name");
		JTextField firstNameTextField = new JTextField(15);
		JLabel lastNameLabel = new JLabel("Last Name");
		JTextField lastNameTextField = new JTextField(15);
		JLabel addressLabel = new JLabel("Address");
		JTextField addressTextField = new JTextField(15);

		panel.add(firstNameLabel);
		panel.add(firstNameTextField);
		panel.add(lastNameLabel, "gap unrelated");
		panel.add(lastNameTextField, "wrap");
		panel.add(addressLabel);
		panel.add(addressTextField, "span, grow");

		frame.add(panel, BorderLayout.CENTER);

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
