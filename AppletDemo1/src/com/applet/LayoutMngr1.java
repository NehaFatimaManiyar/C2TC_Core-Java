package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;


public class LayoutMngr1 extends Applet {
	Label l1,l2,l3;
	Button b1;


public void init() {
	//void TestFlowLayout(){
		l1 = new Label("Alok");
		l2 = new Label("Neelam");
		l3 = new Label("Sharda");
		b1 = new Button("Press here for Testing");
		setLayout(new FlowLayout());
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		
	}




private void TestFlowLayout() {
	// TODO Auto-generated method stub
	
}
}
