package com.methods_Ex;

public class MethodOR1 {
	 public void eat()
	   {
	      System.out.println("Human is eating");
	   }
	}
	class Boy extends MethodOR1  {
	   //Overriding method
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	   public static void main( String args[]) {
	      Boy obj = new Boy();
	      //This will call the child class version of eat()
	      obj.eat();
	   }
	
}
