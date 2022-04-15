package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

public class AddDemo extends Applet{
TextField t;
Label l;
Button go;
public void init() {
	l = new Label("Search");
	t = new TextField(7);
	go = new Button("Go");
	add(l);
	add(t);
	add(go);	
}
}
