package com.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class InitDemo extends Applet{
	String str;
	Font f = new Font("TimesRoman", Font.BOLD,40);
public void init() {
	str = getParameter("string");
	if(str==null)
		str = " My Friend ";
	str = " Hello " + str;	
}

public void paint(Graphics g) {
	g.setFont(f);
	g.setColor(Color.magenta);
	g.drawString(str,40,40);
}
}
