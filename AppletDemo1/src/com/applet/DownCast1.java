package com.applet;
class P {
	int a;
	public void m1() {
		a=7;
	System.out.println("The number is " + a);
	}
}
class C extends P {
	int b;
	public void m1() {
		b=11;
	System.out.println("The number is " + b );
	}
}

public class DownCast1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    P p = new C();
    //Performing Downcasting
    C c = (C)p;
    c.m1();
    p.m1();
	}

}
