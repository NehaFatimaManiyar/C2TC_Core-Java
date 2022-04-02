package com.abstract_keyword;
abstract class Bank {
	abstract int getRateOfInterest();

}

class SBI extends Bank {
	int getRateOfInterest() {
		return 7;
		
	}
}

class Axis extends Bank {
	 int getRateOfInterest() {
		return 11;
		
	}
}
public class AbsMethod_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new SBI();
		System.out.println("Rate of interest is :" + b.getRateOfInterest()+"%");
		b = new Axis();
		System.out.println("Rate of Interest is : " + b.getRateOfInterest()+"%");
	}

}
