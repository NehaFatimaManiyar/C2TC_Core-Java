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


public class AbsMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Shape sp = new Circle();
    sp.draw();
    
	}

}
