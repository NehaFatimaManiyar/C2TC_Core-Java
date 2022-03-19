package newprogram;

import java.util.Scanner;

public class TryImport3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The Multiplication Table of the Entered Number is :");
	    int num = sc.nextInt();
	    
	    for (int i=1;i<=10;i++)
	    {
	   
	    	System.out.println(num + "*" + i + "=" + (num * i));
	    }
	 sc.close();
	}
	}
	    
	   