package com.constructorEx;

public class ParamCons {
String langg;
 //constructor accepting string value 
ParamCons(String lang){
	  
	langg = lang;
	System.out.println(lang + " Programming Language");
}	

// calling to the Constructor by passing string values
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ParamCons l1 = new ParamCons("Java");
   ParamCons l2 = new ParamCons("Python");
   ParamCons l3 = new ParamCons("C");
   
	}

}
