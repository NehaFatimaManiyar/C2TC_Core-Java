package newprogram;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);

System.out.println("Enter Your Marks for sub1:" );
int marks1=s.nextInt();

System.out.println("Enter your marks for sub2:");
int marks2=s.nextInt();

System.out.println("Enter Your Marks for sub3:" );
int marks3=s.nextInt();

System.out.println("Enter your marks for sub4:");
int marks4=s.nextInt();

System.out.println("Enter Your Marks for sub5:" );
int marks5=s.nextInt();

System.out.println("Enter your marks for sub6:");
int marks6=s.nextInt();

int total = (marks1+marks2 + marks3+ marks4 + marks5 + marks6);
System.out.println("Your total Marks:" + total);

float prcnt = total/600*100f;
System.out.println("Total Percentage:" + prcnt);

s.close();

	}

}
