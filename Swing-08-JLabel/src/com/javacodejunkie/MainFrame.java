package com.javacodejunkie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame {

	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton button;

	public MainFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("JLabel Demo");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setBackground(Color.GRAY);
		frame.add(panel, BorderLayout.NORTH);

		label = new JLabel("My Cool App");
		panel.add(label);

		label.setForeground(Color.WHITE);

		label.setFont(new Font("Sans-serif", Font.BOLD, 36));

		ImageIcon labelIcon = new ImageIcon("logo.png");
		label.setIcon(labelIcon);

		label.setIconTextGap(10);

		// label.setHorizontalTextPosition(SwingConstants.CENTER);
		// label.setVerticalTextPosition(SwingConstants.BOTTOM);

		button = new JButton("Update Label Text");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("<html>My Cool App <br> Buy it now</html>");
			}
		});

		frame.add(button, BorderLayout.SOUTH);

	}

	public void show() {
		this.frame.setVisible(true);
	}
}
