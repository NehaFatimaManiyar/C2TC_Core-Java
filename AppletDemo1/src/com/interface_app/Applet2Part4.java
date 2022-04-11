package com.interface_app;
//Scenario2
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part4 extends Applet implements ActionListener {
Button b1,b2;
TextField t;
public void init() {  //Override
	add(b1 = new Button("Click"));
	add(t = new TextField(15));
	add(b2 = new Button("Clear"));
	H h = new H();
	b1.addActionListener(h);
	h.takeRef(this);
	b2.addActionListener(new I(this));
}

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}

class H implements ActionListener {  //Outer class
	//reg b1
	Applet2Part4 ap;
	public void takeRef(Applet2Part4 ap) {
		this.ap=ap;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ap.t.setText("Hello World");
	}
	
}

class I implements ActionListener { //Outer class
	//reg b2
	Applet2Part4 ap;
	public I(Applet2Part4 ap) {
		this.ap=ap;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ap.t.setText("");
	}
	
}