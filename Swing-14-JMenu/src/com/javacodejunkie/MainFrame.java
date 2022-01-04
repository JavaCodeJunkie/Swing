package com.javacodejunkie;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class MainFrame implements ActionListener {

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenuItem newMenuItem;
	private JMenuItem saveMenuItem;
	private JMenuItem exitMenuItem;

	public MainFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Java Code Junkie - JMenu Demo");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLayout(new BorderLayout(10, 10));
		frame.setLocationRelativeTo(null);
		
		// Change Font Size for Menu and MenuIem
		Font f = new Font("sans-serif", Font.PLAIN, 18);
		UIManager.put("Menu.font", f);
		UIManager.put("MenuItem.font", f);
		UIManager.put("CheckBoxMenuItem.font", f);
		UIManager.put("RadioButtonMenuItem.font", f);
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		newMenuItem = new JMenuItem("New...");
		ImageIcon icon = new ImageIcon("images/new.gif");
		newMenuItem.setIcon(icon);
		newMenuItem.setIconTextGap(10);
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		newMenuItem.addActionListener(this);
		
		saveMenuItem = new JMenuItem("Save");
		saveMenuItem.setIconTextGap(10);
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		saveMenuItem.addActionListener(this);
		
		exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setIconTextGap(10);
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		exitMenuItem.addActionListener(this);
		
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		
		fileMenu.add(new JRadioButtonMenuItem("RadioButton"));
		fileMenu.add(new JCheckBoxMenuItem("CheckBox"));
		fileMenu.add(new JMenu("Sub Menu"));
		
		fileMenu.addSeparator();
		
		fileMenu.add(exitMenuItem);
		
		menuBar.add(fileMenu);
		
		frame.setJMenuBar(menuBar);

	}

	public void show() {
		this.frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JMenuItem) {
			JMenuItem item = (JMenuItem) e.getSource();
			String text = item.getText();
			System.out.println(text);
		}
	}


}
