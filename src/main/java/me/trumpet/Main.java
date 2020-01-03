package me.trumpet;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main {
	public static void main(String args[]) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame frame = new JFrame("Trumpet");
		frame.setSize(screenSize.width, screenSize.height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
