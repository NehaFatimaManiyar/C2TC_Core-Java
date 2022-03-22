package com.operation.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teacher {
	String name,degree;
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		
	}
	public void accept() throws IOException {
		// TODO Auto-generated method stub
		 
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name:");
		String name = b.readLine();
		
		
		System.out.println("Enter Degree:");
		String degree = b.readLine();
		
	}
public void display() {
		
		// TODO Auto-generated method stub
		System.out.println("Name:" + name);
		System.out.println("Degree:" + degree);
	}
}

	
	
	
	
	
	