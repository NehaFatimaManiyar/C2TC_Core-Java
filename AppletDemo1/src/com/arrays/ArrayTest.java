package com.arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = new int[25]; //Declaring an array
int i;
System.out.println("Numbers in the array 'a' are: ");
for(i=0; i <25; i++) {
	a[i]=i*2;
	System.out.println(a[i]+" ");
	
}
System.out.println("Length of Array 'a' is: " + a.length);
for(i=0; i<(a.length-1);i++);
System.out.println("The last element is: " +a[i]);
	}

}