package com.constructorEx;

public class NoArg {
int i;
//Constructor with no parameter

 private NoArg (){
	i = 5;
	System.out.println("Constructor is Called");
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      NoArg no = new NoArg();
      System.out.println("Value of i :" + no.i);
	}

}
