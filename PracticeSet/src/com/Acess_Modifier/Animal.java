package com.Acess_Modifier;

public class Animal {
	
	protected void display() {
		System.out.println("I am an Animal");
	}
}
	class Dog extends Animal {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
 //object of dog class
			Dog d = new Dog();
			d.display();
	}

}
