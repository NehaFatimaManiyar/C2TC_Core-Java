package com.mypackage;

public class FinalD3 {
	class X
	{
	    final void print()
	    {
	        System.out.println("This method can not be overridden.");
	    }
	}

	class Y extends X
	{
	  // print() // Causes a compilation error, can not override a final method
	    {
	    }    
	}
}
