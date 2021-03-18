package com.javacodejunkie;

import java.awt.EventQueue;

public class Launcher {

	public static void main(String[] args) {
//		try {
//			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//				System.out.println(info.getName());
//				if ("Nimbus".equals(info.getName())) {
//					UIManager.setLookAndFeel(info.getClassName());
//					break;
//				}
//			}
//		} catch (Exception e) {
//			// If Nimbus is not available, you can set the GUI to another look and feel.
//		}
		
		// Run this program on the Event Dispatch Thread (EDT)
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainFrame();
			}
		});
	}
}