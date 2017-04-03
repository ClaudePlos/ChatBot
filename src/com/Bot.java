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
		this.setLayout(null);
		this.setTitle("AI");
		
		txtEnter.setLocation(2, 540);
		txtEnter.setSize(590,30);
		
		this.add(txtEnter);
		
	}
	
	public static void main(String[] args) {
		new Bot();
	}
	
	

}
