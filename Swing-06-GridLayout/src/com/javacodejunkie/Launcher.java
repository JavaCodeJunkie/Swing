package com.javacodejunkie;

import java.awt.EventQueue;

public class Launcher {

	public static void main(String[] args) {
		// Run this program on the Event Dispatch Thread (EDT)
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainFrame frame = new MainFrame();
			}
		});
	}
}