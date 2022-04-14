package com.interface_app;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Anonymous class in different way 
public class Applet2Part5 extends Applet implements ActionListener {

	Button b1,b2;
	TextField t;
	public void init() {
		add(b1= new Button("Click")); //initialize b1 component
		add(t= new TextField(15));
		add(b2= new Button("Clear"));
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			t.setText("Hello World");
		}
});
	b2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		t.setText("");
	}
});
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}