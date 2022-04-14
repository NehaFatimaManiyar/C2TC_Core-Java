package com.applet;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioBtnDemo2 extends Applet implements ItemListener{
	CheckboxGroup lngGrp = null;
	 
	 public void init(){
	 
	 //create group
	 lngGrp = new CheckboxGroup();
	 
	 //create checkboxes and add to group
	 Checkbox java = new Checkbox("Java", lngGrp, true);
	 Checkbox cpp = new Checkbox("C++", lngGrp, false);
	 Checkbox py = new Checkbox("Python", lngGrp, false);
	 
	 //add radio buttons
	 add(java);
	 add(cpp);
	 add(py);
	 

	 //add listeners
	 java.addItemListener(this);
	 cpp.addItemListener(this);
	 py.addItemListener(this);
}

	 public void itemStateChanged(ItemEvent ie) {
	 repaint();
	 }
	 
	 public void paint(Graphics g){
		 
		 /*
		 * To get selected radio button, use
		 * Checkbox getSelectedCheckbox()
		 * method of CheckboxGroup class.
		 */
		 
		 Checkbox chk = lngGrp.getSelectedCheckbox(); 
		 
		 g.drawString(chk.getLabel() + " is selected", 10 ,70);
		 }
}