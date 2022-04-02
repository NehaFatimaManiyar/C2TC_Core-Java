package com.abstract_keyword;
abstract class Bike {  //Defining Abstract class
	abstract void run();//abstract method run();
	
}
class Royal_Enfield_Bullet_350 extends Bike {
	void run() {  //overriding the abstract method for implementation
	System.out.println("Go slow & run Safely....");
	}
}

public class AbsMethod_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	     Bike bk = new Royal_Enfield_Bullet_350();
	     bk.run();
	}

}
