package com.exception.handle;

public class TryCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		 int arr[]= new int[-2];
		 System.out.println("first element:" + arr[0]);
	}
   catch(NegativeArraySizeException n) {
	   System.out.println("Generated Exception:" + n);
   }
	System.out.println("After the try block");
	}

}
