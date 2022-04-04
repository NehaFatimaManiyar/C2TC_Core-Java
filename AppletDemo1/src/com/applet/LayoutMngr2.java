package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;

public class LayoutMngr2 extends Applet {
Button b1,b2,b3,b4;

public void init() {
	setLayout(new GridLayout(1,2,2,2));
	add(b1 = new Button("one"));
	add(b2 = new Button("two"));
	add(b3 = new Button("three"));
	add(b4 = new Button("four"));
	
}
}
