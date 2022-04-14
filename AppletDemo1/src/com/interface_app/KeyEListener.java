package com.interface_app;

import java.applet.Applet;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEListener extends Applet implements KeyListener{
public void init() {
	Label l = new Label("Enter Characters");
	add(l);
	TextField t = new TextField(20);
	t.addKeyListener(this);
	add(t);
}
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	showStatus("Recently typed character in the TextField is: " + e.getKeyChar());
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

}
