package com.loops;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x,y,sum;
     for(x=1; x <= 3; x++) {
    	 for(y=1; y<=2; y++) {
    		 sum = x + y;
    		 System.out.println(+x + "+" +y + "=" + sum);
    	 }
     }
	}

}
