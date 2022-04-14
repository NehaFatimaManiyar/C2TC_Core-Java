package com.interface_app;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part7 extends Applet {
	Button b1,b2;
	TextField t;
	public void init() {  //Override
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		b1.addActionListener((e)-> {t.setText("Hello World");});
		b2.addActionListener((e)->t.setText(""));
		
	}
}