package com.guiapps;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIApps2 extends Frame {

	Button b1,b2;
	TextField t;
	
	public GUIApps2() {
		setLayout(new FlowLayout()); //setting the layout
		add(b1 = new Button("Click"));
		add(t = new TextField(20));
		add(b2 = new Button("Clear"));
		b1.addActionListener((e)->t.setText("Interface WindowListener"));
		b2.addActionListener((e)->t.setText(" "));

		addWindowListener(new WindowAdapter() {
		      @Override 
		      public void windowClosing(WindowEvent e) {
		        System.exit(0);
		      }
		    });
		
		setSize(400,500);
		setVisible(true);
		setBackground(Color.LIGHT_GRAY);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new GUIApps2();
       Frame frame = new Frame("Interface WindowListener");
       frame.setSize(400, 400);
       frame.setLocationRelativeTo(null);

	}

}
