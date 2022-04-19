package com.arrays;

public class ArrayDemo3_ForE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array1 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
		for(int[] arr2: array1)
		{
		    for(int val: arr2)
		        System.out.print(val);
		}
		
	}

}
