package com.interface_app;

interface Int2
{
   final int a = 10;
   static void display()
   {
       System.out.println("hello");
   }
}
//A class that implements the interface.
public class InterfaceD2 implements Int2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Int2.display();
	}

}
