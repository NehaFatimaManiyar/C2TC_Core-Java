package com.interface_app;


interface In1
{
  final int a = 10;
  default void display()
  {
      System.out.println("Hello World");
  }
}


//A class that implements the interface.
public class InterfaceD implements In1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceD id = new InterfaceD();
        id.display();
	}

}
