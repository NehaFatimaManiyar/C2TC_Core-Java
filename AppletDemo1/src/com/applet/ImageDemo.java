package com.applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;

public class ImageDemo extends Applet{
	
	Image img;
	//MediaTracker tr;
	 public void init() {
     img = getImage(getCodeBase(),"download.jpg");
	 }
	public void paint(Graphics g) {
		//tr = new MediaTracker(this);
		
		//tr.addImage(img, 0);
		g.drawImage(img, 30, 30,this);
	}

	}
