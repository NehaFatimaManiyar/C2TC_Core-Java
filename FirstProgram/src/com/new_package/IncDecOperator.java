package com.new_package;

public class IncDecOperator {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X=0,Y=0;
		
System.out.println("X is " + X + " and Y is " + Y);
X++;
System.out.println("X++ results in " + X);
++X;
System.out.println("++X results in " + X);
System.out.println("Resetting X back to 0. ");
X=0;
System.out.println("______________________________");
Y = X++;
System.out.println("Y = X++ (postfix) results in:" );
System.out.println("X is " + X);
System.out.println("Y is " + Y);
System.out.println("______________________________");

Y = ++X;
System.out.println("Y = ++X (prefix) results in:" );
System.out.println("X is " + X);
System.out.println("Y is " + Y);
System.out.println("______________________________");
	}

}
