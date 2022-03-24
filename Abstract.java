
abstract class A {
	int i=11;
	
abstract void m1();

 void m2() {
	 System.out.println("Hii");
 }
 
abstract void m3();

public int getI() {
	return i;
}

public void setI(int i) {
	this.i = i;
}
	
}
class B extends A {
	void m1() {
		System.out.println("Hello");
}

	void m3() {
		System.out.println("Heyy");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();	
		b1.m1();
        b1.m2();
        b1.m3();
        b1.getI();
      System.out.println(b1.getI());
	}

}
