package com.applet;

class N {
	String name ;
	void m1() {
    System.out.println("Method of Super class is Called.");
	}
}

class A extends N {
	int age = 22;
	void m1() {
	System.out.println("Method of Sub class is called.");	
	}
}
public class Upcast2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N n1 = new A(); 
		N n2 = new N();
		n1.name ="Neha";
        A a1 = (A)n1; //Downcasting
        a1.age=22;
        System.out.println("Name: " + a1.name);
        System.out.println("Age:" + a1.age);
    	n2.m1();
        a1.m1();
	}

}
