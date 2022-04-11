package com.interface_app;

public class NestedCls {
int i;
static int j;
 /*public class A{        //member of the class so that we can use all AM
	
}*/
class A {
	public void m1() {      //Non Static method , we can use 
	i=1;
	j=10;
	}
}
static class B {           //non AM(static)
	public void m2() {
		//i = 1;          // can not access because it is non static in nature   //non Static can access But Static can't access Non Static
	j=10;
	}
}
}
