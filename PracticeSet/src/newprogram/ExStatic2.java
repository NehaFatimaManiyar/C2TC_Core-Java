package newprogram;

public class ExStatic2 {
	 static int a=10; 
	int b=20;
	static void show() {
				System.out.println("show():" + a );
	}
	
void Disp() {
	System.out.println("Disp():" + a + " " + b);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ExStatic2.show();
       ExStatic2 disp=new ExStatic2(); // to access this method we should have an object of the class name
       disp.Disp();
	}

}
