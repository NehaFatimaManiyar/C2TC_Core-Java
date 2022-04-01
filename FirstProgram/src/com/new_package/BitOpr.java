package com.new_package;

public class BitOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a =1 , b = 2, c = 3;
 a = a | 4;
 b>>= 1;  //Right shift 
 c<<= 1;  //Left Shift 
 a = a ^ c; //XOR (exclusive OR)
 System.out.println("a = " +a);
 System.out.println("b = " +b);
 System.out.println("c = " +c);
	}

}
