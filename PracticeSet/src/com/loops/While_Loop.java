package com.loops;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int max = 20, prev = 0, next = 1 , sum;
System.out.println("The Fibbonacci series is " + prev);
while(next <= max) {
	System.out.println(next);
	sum = prev + next ;
	prev = next;
	next = sum ;
}

	}

}
