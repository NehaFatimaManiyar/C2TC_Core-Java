package newprogram;

import java.util.Scanner;

public class ExStatic { 
	static void EvenOdd(int num) { //using Static method
		
		System.out.println("Enter any number:");
		Scanner sc =new Scanner (System.in);
		num = sc.nextInt();//3
		sc.close();
		if(num%2==0) 
		System.out.println("The given number " + num + " is is Even.");
		
		else 
		System.out.println("The given number " + num + " is Odd.");
		
		}
	
	void DispStatic() { // using non static method 
		int num=1;
		int sum = (num+num);
		System.out.println("The sum of the numbers is:" + sum);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ExStatic.EvenOdd(0);
    ExStatic st =new ExStatic();
    		st.DispStatic();
     
	} 
	
	}
