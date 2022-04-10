package com.methods_Ex;

public class Access {
int x ;
void m1() {
	
	int y = 10;
	x = y;
	
}

void m2() {
	
	int z = 2;
	x = 5;
	System.out.println(" The value of x is :" + x);
//	y =1 ;  //illegal because y is the variable of method m1().
	
}
public static void main(String[] args) {
	Access ac = new Access();
	ac.m2();
}

}
