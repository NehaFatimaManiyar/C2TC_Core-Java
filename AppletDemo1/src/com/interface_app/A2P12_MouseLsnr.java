package com.interface_app;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


public class A2P12_MouseLsnr extends Applet {
//Button b;
TextField t;
	public void init() {
	//add(b = new Button("Click"));
	add(t = new TextField(30));
		addMouseMotionListener(new MouseMotionAdapter() {
			
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				t.setText("Hello...You have dragged the Mouse :) !!! ");
			}

			
			
		});
		
		
		
	}

	
}
