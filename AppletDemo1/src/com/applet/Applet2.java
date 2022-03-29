package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class Applet2 extends Applet{
	
Button b;
TextField t;

public void init() {
	b = new Button ("SUBMIT"); //Setting the Label of Button Class
	// (OR)   b.setLabel("SUBMIT"); --> we can use this method also for setting the label.
	add(b);
	
	t = new TextField(15); //Setting the Size of the TextField class
	add(t);
}
}
