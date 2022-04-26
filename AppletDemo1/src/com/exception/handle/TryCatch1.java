package com.exception.handle;

public class TryCatch1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=5,c=5;
		int x,y;
   try {
	  x = a /(b-c); 
	  System.out.println(x);
   }
   catch(ArithmeticException e) {
	   System.out.println("Division by Zero ");
   }
   y =  a /(b+c);
   System.out.println("y= " +y);
	}

}
