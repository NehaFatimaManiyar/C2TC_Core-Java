package com.applet;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;


public class LayoutMngr3 extends Applet{
	Button b1,b2,b3,b4,b5;

	public void init() {
		 setLayout(new BorderLayout(5,2));
		 add(new Button("North"), BorderLayout.NORTH);
	     add(new Button("South"), BorderLayout.SOUTH);
	     add(new Button("East"), BorderLayout.EAST);
	     add(new Button("West"), BorderLayout.WEST);
	     add(new Button("Center"), BorderLayout.CENTER);
	}

}
