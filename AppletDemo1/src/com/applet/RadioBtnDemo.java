package com.applet;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class RadioBtnDemo extends Applet{
	public void init( )
	{
		CheckboxGroup chkgrp = new CheckboxGroup ( );
		Checkbox chkRed,chkBlue,chkYellow,chkGreen,chkOrange;

		chkRed = new Checkbox("Red", chkgrp, false);                
		chkBlue = new Checkbox("Blue", chkgrp, false);
		chkYellow = new Checkbox("Yellow", chkgrp, false);
		chkGreen = new Checkbox("Green", chkgrp, true);
		chkOrange = new Checkbox("Orange", chkgrp, false);

		add(chkRed);
		add(chkBlue);                
		add(chkYellow);                
		add(chkGreen);                
		add(chkOrange);
	}
}
