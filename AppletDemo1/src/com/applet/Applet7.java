package com.applet;

import java.applet.Applet;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;

public class Applet7 extends Applet {
	Checkbox c1,c2,c3,c4,c5,c6;
	CheckboxGroup chk;
	TextField t;
	
	public void init() {
		setLayout(new GridLayout(4,2));
		chk = new CheckboxGroup();
	add(c1 = new Checkbox("Tour1",chk,true));
	add(c4 = new Checkbox("Shimla",true));
	add(c2 = new Checkbox("Tour2",chk,false));
	add(c5 = new Checkbox("Manali",true));
	add(c3 = new Checkbox("Tour3",chk,false));	
	add(c6 = new Checkbox("Dalhousie",false));
	add(t = new TextField("2000",15));
	}
}