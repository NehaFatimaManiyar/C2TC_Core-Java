package com.arrays;
class Aa{
	//Default Constructor
}

class Ab {
	String s;
	int i;
	public Ab(int i, String s) { //Parameterized Constructor
		this.i=i;
		this.s=s;
	}
	
}
public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aa a = new Aa(); //ref1 
Aa a1 = a;
Aa a2 = new Aa();//ref2

if(a == a1)
    System.out.println("Equal");
else 
	System.out.println("Not Equal");

if(a == a2)
    System.out.println("Equal");
else 
	System.out.println("Not Equal");

if(a.equals(a1))
	System.out.println("Equal");
else 
	System.out.println("Not Equal");
if(a.equals(a2))
	System.out.println("Equal");
else 
	System.out.println("Not Equal");

Ab b = new Ab(7,"Neha");
Ab b1 = b;
Ab b2 = new Ab(7,"Neha");
if(b == b1)
    System.out.println("Equal");
else 
	System.out.println("Not Equal");

if(b == b2)
    System.out.println("Equal");
else 
	System.out.println("Not Equal");

if(b.equals(b1))
	System.out.println("Equal");
else 
	System.out.println("Not Equal");
if(b.equals(b2))
	System.out.println("Equal");
else 
	System.out.println("Not Equal");


	}

}
