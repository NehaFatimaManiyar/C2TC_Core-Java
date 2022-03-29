package com.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AppletDemo extends Applet {
//Applet life Cycle 
/*public void init() {
		
	}

public void start() {
		
	}
public void stop() {
	
}
public void destroy() {
	
}
/*/
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawString("Welcome to java programming!", 50, 100);
	}
	
}
