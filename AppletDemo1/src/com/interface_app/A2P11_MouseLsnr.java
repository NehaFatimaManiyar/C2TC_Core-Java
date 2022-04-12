package com.interface_app;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class A2P11_MouseLsnr extends Applet {

	public void init() {
		addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX();
				int y = e.getY();
				//String str = "x =" +x+",y = "+y;
				//showStatus(str);
				showStatus(String.valueOf("X = " + x) + "," + String.valueOf("Y = " + y));
			}
		});	
	}
}
