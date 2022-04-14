package com.inheritance.applet;


interface Shape{
	double area();
	
}

class Circle implements Shape {

	double radius;
	Circle(double radius) {
		this.radius=radius;
		
	}
	public double area() {
		double PI = 3.142;
		return (PI * radius * radius);
	}
	
}
class Cylinder extends Circle{
	private static final double PI = 3.142;
	double height;
	 Cylinder(double radius, double height){
		super(radius);
		this.height=height;
	}
	 public double area() { //overriding
	
		return (PI * radius * radius*height);
	 }
}
public class InheritanceDemo1 {

	public static void main(String[] args) {
		Shape s = new Circle(3.142);
		System.out.println("Area of Circle = " + s.area());
		s = new Cylinder(5, 3.142);
		System.out.println("Area of Cylinder = " + s.area());
	}
	
}
