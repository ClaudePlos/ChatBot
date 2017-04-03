package com;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Bot extends JFrame {
	
	private JTextField txtEnter = new JTextField();
	
	public Bot() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("AI");
		
		txtEnter.setLocation(5, 5);
		
	}
	
	public static void main(String[] args) {
		new Bot();
	}
	
	

}
