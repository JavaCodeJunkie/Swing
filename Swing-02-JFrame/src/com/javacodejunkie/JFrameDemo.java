package com.javacodejunkie;

import javax.swing.SwingUtilities;

public class JFrameDemo {

	public static void main(String[] args) {
		// Run this program on the Event Dispatch Thread (EDT)
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrameOne frame1 = new JFrameOne();
				frame1.showWindow();
				
				JFrameTwo frame2 = new JFrameTwo();
				frame2.show();
			}
		});
	}
}