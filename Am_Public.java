package com.Acess_Modifier;

public class Am_Public {
	
//public variable
	public int num;
	
//public method
	public void display() {
		
		System.out.println("The Given Number is: " + num);
	}
	
	//main.java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Accessing the public class
		Am_Public am = new Am_Public();
		
		//Accessing the public variable
		am.num=7;
		
		//Accessing the public method 
		am.display();
	}

}
