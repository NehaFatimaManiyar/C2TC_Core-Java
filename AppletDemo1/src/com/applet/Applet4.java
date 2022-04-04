package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet4 extends Applet{
	Button b1,b2;
	TextField t;
	
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(5));
		add(b2 = new Button("Clear"));
	}
	public boolean action(Event e, Object o) {
		if(e.target.equals(b1));
		t.setText("Hello");
		//if(e.target.equals(b2));
		//t.setText("Hello");
		b2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	     t.setText(" ");
		// t.setText(null); //or use this.
		}
		});

		return true;
		
	}

}
