package com.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class GraphicsDemo1 extends Applet {
	 public void paint(Graphics g)
	  {  
	    g.setColor(Color.blue);  
	    g.drawString("Welcome to programming ",50, 50); 
	    g.setColor(Color.pink);  
	    g.fillOval(170,200,30,30);  
	    g.drawArc(90,150,30,30,30,270);  
	    g.fillArc(270,150,30,30,0,180);  
	    g.drawLine(21,31,20,300);  
	    g.drawRect(70,100,30,30);  
	    g.fillRect(170,100,30,30);  
	    g.drawOval(70,200,30,30);  
	  }  

}
