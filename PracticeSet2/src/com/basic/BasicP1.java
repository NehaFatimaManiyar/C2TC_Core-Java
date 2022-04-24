package com.basic;

import java.text.SimpleDateFormat;
import java.util.Date;
//convert String to Date in Java 
/*String to Date :-->SimpleDateFormat.parse(String);
  Date to String :-->SimpleDateFormat.format(Date);*/
public class BasicP1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s = "07/06/1999";
        Date d = new SimpleDateFormat("dd/MM/yyyy").parse(s);
        System.out.println(s+" "+d);
	}

}
