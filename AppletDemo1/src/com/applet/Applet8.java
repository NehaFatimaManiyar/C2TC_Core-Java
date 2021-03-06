package com.applet;
import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Applet8 extends Applet {
	Panel1 p1;
	Panel2 p2;
	
	public void init() {       //initialization
	setLayout(new GridLayout(1,2));
	add(p1 = new Panel1());
	add(p2 = new Panel2());
	 p2.c1.setState(true);
	 p2.c2.setState(true);
	 p2.c3.setState(false);
	 p2.t.setText("5000");
	 
	}
	public boolean action(Event e, Object o) { //overriding 
     if( p1.c1.getState()) {
	 p2.c1.setState(true);
	 p2.c2.setState(true);
	 p2.c3.setState(false);
	 p2.t.setText("5000");
		}
     
     if( p1.c2.getState()) {
    	 p2.c1.setState(false);
    	 p2.c2.setState(true);
    	 p2.c3.setState(true);
    	 p2.t.setText("7000");
}
	
     if( p1.c3.getState()) {
    	 p2.c1.setState(true);
    	 p2.c2.setState(false);
    	 p2.c3.setState(true);
    	 p2.t.setText("9000");
     }
	return true;
	}
    class Panel1 extends Panel{
		Checkbox c1,c2,c3;
		CheckboxGroup chk;
		public Panel1() { //calling to the constructor 
		CheckboxGroup chk = new CheckboxGroup();
		setLayout(new GridLayout(4,2));
		add(c1 = new Checkbox("Tour1",chk,true));
		add(c2 = new Checkbox("Tour2",chk,false));
		add(c3 = new Checkbox("Tour3",chk,false));
		
		}
	}
	class Panel2 extends Panel {
		Checkbox c1,c2,c3; //new variables with same names possible because they are in different class.
		TextField t;
		public Panel2(){
			setLayout(new GridLayout(4,1));
			add(c1 = new Checkbox("Manali"));
			add(c2 = new Checkbox("Shimla"));
			add(c3 = new Checkbox("Dalhousi"));
			add(t = new TextField("2000",15));
		}
	}
}
