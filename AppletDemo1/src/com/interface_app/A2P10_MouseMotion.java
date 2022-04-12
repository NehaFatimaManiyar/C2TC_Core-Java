package com.interface_app;

import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

//MouseMotionListener,12/04
public class A2P10_MouseMotion extends Applet {

public void init() {
	
	addMouseMotionListener(new MouseMotionAdapter() {
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			int x = e.getX();
			int y = e.getY();
			/*String i =String.valueOf(x);
			String j =String.valueOf(y);*/
			showStatus(String.valueOf(x) + "," + String.valueOf(y));
		}
	});	
}	
}
