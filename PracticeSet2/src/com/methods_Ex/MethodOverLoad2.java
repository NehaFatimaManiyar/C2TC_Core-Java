package com.methods_Ex;

public class MethodOverLoad2 {
	 private static void display(int a){
    System.out.println("Arguments: " + a);
 }

 private static void display(int a, int b){
     System.out.println("Arguments: " + a + " and " + b);
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   display(1);
	       display(1, 4);
	}

}
