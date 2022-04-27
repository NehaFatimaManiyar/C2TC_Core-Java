package com.methods_Ex;


//Method Overloading
public class Method_OverLoad {
void add(int x, int y) {                  //Method1
	System.out.println("The addition of Integers is :" +(x+y));
}

void add(String x, String y) {            //Method2

	System.out.println("The addition of Characters is :" +(x+y));
}

void add(float x, float y) {              //Method3

	System.out.println("The addition of floats is :" +(x+y));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_OverLoad o1 = new Method_OverLoad();
		o1.add(11, 7);
		o1.add("Mais","Neha");
		o1.add(1.1f, 1.1f);
	}

}
