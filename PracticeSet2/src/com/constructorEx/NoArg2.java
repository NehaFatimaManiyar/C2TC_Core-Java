package com.constructorEx;

class Company{

	String name;
	
 public Company() {
	 name = "Apple Inc";
 }
}
 public class NoArg2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Company cm = new Company();
    System.out.println("Comapany name: " + cm.name);
	}

}
