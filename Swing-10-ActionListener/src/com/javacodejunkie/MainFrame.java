package com.javacodejunkie;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	private JButton button;

	public MainFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("ActionListener Demo");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLayout(new BorderLayout(10, 10));
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		label = new JLabel("Enter your name");
		textField = new JTextField(20);
		button = new JButton("Save");
		
//		button.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Button clicked");
//			}
//		});
		
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		
		frame.add(panel, BorderLayout.CENTER);
	}

	public void show() {
		this.frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(textField.getText());
	}
}
