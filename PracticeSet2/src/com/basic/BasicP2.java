package com.basic;

public class BasicP2 {
 static boolean isMirrorInverse(int arr[]) {
	 for(int i=0; i<arr.length; i++) {
		 if(arr[arr[i]]!=0) 
	return false;
	 }
			 return true;
	 }
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[] = { 2,11,8,7,4};
 if(isMirrorInverse(arr)) {
	 System.out.println("True");
 }
	 else
		 System.out.println("False");
 }
	}


