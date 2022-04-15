package com.mypackage;

public class FinalD {
	class A
	{
	    final int i = 10;
	}

	class B
	{
	    final int k;
	    
	    B(int k)
	    {
	        this.k = k;
	    }
	}

	class C
	{
	   // final int j; // Causes a compilation error

	  //  C(){
	    	
	  //  }
	}
}
