package com.javacodejunkie;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame implements LoginListener {

	private JFrame frame;
	private LoginView loginView;

	public MainFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setTitle("Java Swing - JPanel");
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		loginView = new LoginView();
		loginView.setLoginListener(this);

		frame.add(loginView.asComponent(), BorderLayout.CENTER);

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	@Override
	public void onLogin(LoginEvent event) {
		System.out.println("Login Event Received");
		System.out.println("Source: " + event.getSource());
		System.out.println("Username: " + event.getUser().getName());
		System.out.println("Password: " + event.getUser().getPassword());
		System.out.println("Check credentials and show main window if valid");
	}
}
