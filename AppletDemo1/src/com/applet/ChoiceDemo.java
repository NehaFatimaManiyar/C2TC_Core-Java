package com.applet;

import java.applet.Applet;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;

public class ChoiceDemo extends Applet{
Choice course;
public void init(){
	
	setLayout(new FlowLayout());
	course = new Choice();
	course.add("BBA");
	course.add("BCA");
	course.add("BCOM");
	course.add("BCS");
	course.add("BA");
	course.add("BE");
	add(course);
	setBackground(Color.pink);
}
}
