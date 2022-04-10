package com.methods_Ex;

public class RefOfObject {
int x,y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    RefOfObject ob1 = new  RefOfObject();
    ob1.x=5;
    ob1.y=10;
    System.out.println(" The value of x and y  is : " + ob1.x + " " + ob1.y);
    ob1.x=11;
    ob1.y=7;
    System.out.println(" The value of x and y  is : " + ob1.x + " " + ob1.y);
	}

}
