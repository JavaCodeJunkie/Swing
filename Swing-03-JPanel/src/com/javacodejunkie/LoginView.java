package com.javacodejunkie;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView implements View {

	private JPanel loginPanel;
	private JLabel lblUserName;
	private JTextField txtUserName;
	private JLabel lblPassword;
	private JTextField txtPassword;
	private JLabel lblMessage;
	private JButton btnLogin;
	private Font font;

	private LoginListener loginListener;

	public LoginView() {
		initialize();
	}

	private void initialize() {
		loginPanel = new JPanel(new GridBagLayout());
		font = new Font("JetBrains Mono", Font.PLAIN, 18);
		loginPanel.setFont(font);

		lblUserName = new JLabel("User Name");
		lblUserName.setFont(font);
		txtUserName = new JTextField(20);
		txtUserName.setFont(font);
		lblPassword = new JLabel("Password");
		lblPassword.setFont(font);
		txtPassword = new JPasswordField(20);
		txtPassword.setFont(font);
		btnLogin = new JButton("Login");
		btnLogin.setFont(font);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					User user = new User(txtUserName.getText(), txtPassword.getText());
					fireLoginEvent(user);
				} catch (Exception e1) {
					System.out.println("Login error:");
					Throwable[] suppressed = e1.getSuppressed();
					for (Throwable th : suppressed) {
						System.out.println(th.getMessage());
					}
				}
			}
		});
		lblMessage = new JLabel();
		lblMessage.setFont(font);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(5, 10, 0, 10);
		gbc.anchor = GridBagConstraints.EAST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		loginPanel.add(lblUserName, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		loginPanel.add(txtUserName, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		loginPanel.add(lblPassword, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		loginPanel.add(txtPassword, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.fill = GridBagConstraints.NONE;
		loginPanel.add(btnLogin, gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 2;
		loginPanel.add(lblMessage, gbc);
		lblMessage.setBorder((BorderFactory.createEmptyBorder(10, 40, 10, 40)));

		loginPanel.setBorder(BorderFactory.createEmptyBorder(40, 80, 40, 80));
	}

	public void setLoginListener(LoginListener listener) {
		this.loginListener = listener;
	}

	public void fireLoginEvent(User user) {
		LoginEvent event = new LoginEvent(this, user);
		if (loginListener != null) {
			loginListener.onLogin(event);
		}
	}

	@Override
	public Component asComponent() {
		return loginPanel;
	}

}
