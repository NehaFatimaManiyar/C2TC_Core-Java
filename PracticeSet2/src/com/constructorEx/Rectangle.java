package com.constructorEx;

public class Rectangle {
     int len,br;
     
     Rectangle(int x, int y){ //Defining constructor
    	len = x;
    	br = y;
    	 
     }
     
     int calArea() {
		return (len * br);
    	 
     }
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Rectangle r = new Rectangle(15,20);   //Calling Constructor
     r.calArea();
     System.out.println("The Area is : " + r.calArea());
	}

}
