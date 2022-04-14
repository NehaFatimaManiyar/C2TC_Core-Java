package com.interface_app;
interface Int3 {
    
    // public, static and final
    final int a = 10;
  
    // public and abstract
    void display();
}
//A class that implements the interface.
public class InterfaceDemos implements Int3 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}
public static void main(String[] args) {
	InterfaceDemos id2 = new InterfaceDemos();
	id2.display();
	System.out.println(a);
}
}
