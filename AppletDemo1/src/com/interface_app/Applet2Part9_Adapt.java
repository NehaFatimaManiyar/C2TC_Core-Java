package com.interface_app;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Applet2Part9_Adapt extends Applet {
	Button b1,b2;
	TextField t;
	public void init() {
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addFocusListener(new FocusListener() {

			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				t.setText("Hello World");
			}

			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	    b2.addFocusListener(new FocusListener() {
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			t.setText("");
		}

		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	});
	}
	
}
