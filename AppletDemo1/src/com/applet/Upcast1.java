package com.applet;
class Parent {
	public void m1() {
		System.out.println("The Method of Class Parent");
	}
}

class Child extends Parent {
	public void m1() {
		System.out.println("The Method of Class Child");
	}
}


public class Upcast1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child(); 
		Parent p1 = new Child();//Upcasting
		p.m1();
		p1.m1();
	}

}
