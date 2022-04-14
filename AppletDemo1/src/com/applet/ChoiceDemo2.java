package com.applet;

import java.applet.Applet;
import java.awt.Choice;

public class ChoiceDemo2 extends Applet{
	public void init(){
		 
		 /*
		 * To create a AWT choice control or a combobox, use
		 * Choice() 
		 * constructor of AWT Choice class.
		 */
		 Choice language = new Choice();
		 
		 /*
		 * To add items in a choice control use
		 * void add(String item)
		 * method of AWT Choice class.
		 */
		 language.add("Java");
		 language.add("C++");
		 language.add("Python");
		 language.add("JavaScript");
		 
		 //add choice
		 add(language);
	}
}
