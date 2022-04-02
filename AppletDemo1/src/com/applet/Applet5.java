package com.applet;

import java.applet.Applet;
import java.awt.Choice;

public class Applet5 extends Applet{
	Choice c;
	
	public void init() {  
		c = new Choice();
		c.add("Choice 1");
		c.add("Choice 2");
		c.add("Choice 3");
		add(c);
		
		
	}

}
