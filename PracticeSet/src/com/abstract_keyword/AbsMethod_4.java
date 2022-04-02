package com.abstract_keyword;
abstract class Shape {
	abstract void draw();
}


class Rectangle extends Shape {
	void draw() {
		
		System.out.println("Drawing Rectangle ");
	}

}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle");

	}
}

public class AbsMethod_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape sp = new Circle();
		    Shape s = new Rectangle();
		    sp.draw();
		    s.draw();
	}

}
