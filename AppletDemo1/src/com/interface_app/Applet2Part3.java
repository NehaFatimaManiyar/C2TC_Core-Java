package com.interface_app;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part3 extends Applet implements ActionListener {
	Button b1,b2;
    static TextField t;
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
       b1.addActionListener(new N());
       b2.addActionListener(new F());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
	class N implements ActionListener {
		//Applet2Part3 a = new Applet2Part3();
		//a.t.setText("Hello World");
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Applet2Part3.t.setText("Hello World");
			//t.setText("Hello World");
		}
	}
	
	class F implements ActionListener {
	public void actionPerformed(ActionEvent arg0) {
		//Applet2Part3  a= new Applet2Part3();
		Applet2Part3.t.setText("");
	}	
	}
	

	
