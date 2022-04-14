package com.inheritance.applet;

class A {
	 int num;
	A(int num){
		this.num = num; 
	}
}

class B extends A {
	int num;
	B(int a, int b){
	super(a);
	this.num=b;
	
	}
	void display() {
		System.out.println("In A, num = " + super.num);
		System.out.println("In B, num = " + num);
	}
}

public class Inherit1 {
A ref = new A(7);
B ref1 = new B(7,11);

}
