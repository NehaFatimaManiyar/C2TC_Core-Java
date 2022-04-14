package com.applet;
import java.applet.Applet;
import java.awt.Graphics;

 
public class ApTable extends Applet {
	
  public void paint(Graphics g) {
	  int x=20,y=20;
	  for(int i=1;i<=10;i++)
	  {
	  for(int j=1;j<=10;j++)
	   {
	    int k=i*j;
	    g.drawString(k+"",x,y);
	    x=x+30;
	   }
	   x=20;
	   y=y+30;
	  }
	 }
	}
