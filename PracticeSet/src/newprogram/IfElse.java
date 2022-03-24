package newprogram;

import java.util.Scanner;

public class IfElse { //program to illustrate if else construct

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter any number:");
		n=sc.nextInt();
		
if ( n % 2 == 0) 
	System.out.println("The number " + n + " is even");

else 
	System.out.println("The number " + n + " is odd");

sc.close();
			
	}

}
