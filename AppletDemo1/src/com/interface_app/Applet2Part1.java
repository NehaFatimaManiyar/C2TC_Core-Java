package com.interface_app;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part1 extends Applet implements ActionListener{
Button b1,b2;
TextField t;
public void init()
{
	add(b1 = new Button("Click"));
	add(t = new TextField(15));
	add(b2 = new Button("Clear"));
	b1.addActionListener(this);
	b2.addActionListener(this);
	}

public void actionPerformed(ActionEvent e) {
	Object o = e.getSource();
	if(o.equals(b1))
	t.setText("HelloWorld");
	if(o.equals(b2))
		t.setText("");
}
}
