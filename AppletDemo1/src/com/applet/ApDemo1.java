package com.applet;

import java.applet.Applet;
import java.awt.Checkbox;

public class ApDemo1 extends Applet {
	public void init( )
	 {
	  /*The statement creates an object and
	  adds the checkbox on the applet.*/

	  Checkbox chkShoes,chkSocks,chkShirt;
	  chkShoes = new Checkbox("Shoes");
	  chkSocks = new Checkbox("Socks", true); //This checkbox is checked
	  chkShirt = new Checkbox("Shirt");

	  add(chkShoes);                
	  add(chkSocks);                
	  add(chkShirt);
	 }
	}


