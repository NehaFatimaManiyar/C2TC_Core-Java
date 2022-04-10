package com.methods_Ex;

public class MethodArg {

	void calcSqr(int x) {
		int sqr = x * x;
		System.out.println(" The Square of " +x+ " is : " + sqr);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     MethodArg ma = new MethodArg();
     ma.calcSqr(7);
	}

}
