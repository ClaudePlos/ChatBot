package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame {
	
	private JTextField txtEnter = new JTextField();
	
	private JTextArea txtChat = new JTextArea();
	
	public Bot() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("AI");
		
		txtEnter.setLocation(2, 540);
		txtEnter.setSize(590, 30);
		
		txtEnter.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String uText = txtEnter.getText();			
				txtChat.append("You: " + uText + "\n");
				
				if (uText.contains("hi")){
					botSay("Hello there!");
				}
				else{
					int decider = (int) (Math.random()*3+1);
					
					if ( decider == 1 ){
						botSay("I didn't get that");
					}
					else if (  decider == 2 ){
						botSay("Please rephrase that");
					}
					else if (  decider == 3 ){
						botSay("???");
					}
					
				}
				
				txtEnter.setText("");			
			}
		});
		
		txtChat.setLocation(15, 5);
		txtChat.setSize(560, 510);
		txtChat.setEditable(false);
		
		this.add(txtEnter);
		this.add(txtChat);
		
	}
	
	public void botSay( String s ){
		txtChat.append("AI: " + s + "\n");
	}
	
	public static void main(String[] args) {
		new Bot();
	}
	
	

}
