package newprogram;

import java.util.Scanner;

public class UsingScnner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your Name :");
   String name = sc.nextLine();
   System.out.println("Enter your Mobile No:");
   long Phno = sc.nextLong();
   System.out.println("College Name:");
   String clg = sc.next();
   System.out.println("Your entered Details are : ");
   System.out.println("Name: " + name);
   System.out.println("Phone No: " + Phno );
   System.out.println("College Name: " + clg);
   sc.close();
	}

}
