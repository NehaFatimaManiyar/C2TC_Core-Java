package newprogram;

import java.util.Scanner;

public class Sprog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
    
     System.out.println("Finding Square root of a given number:");
     
    System.out.println("Enter the Number :");
    int num = sc.nextInt();
    
    int SQroot = (num * num);
    System.out.println("The Square Root of a Given Number is :" + SQroot);
    

    System.out.println("Finding Cube of a given number:");
    
   System.out.println("Enter the Number :");
   int cube = sc.nextInt();
   
   int c3 = cube*cube*cube;
   System.out.println("The Cube of a Given Number is :" + c3);
    
    sc.close();
    
	}

}
