package com.abstract_keyword;
abstract class Bikes {
	Bikes(){
		System.out.println("Bikes");
	}
	
	abstract void run();

	
	void changeGear() {
		System.out.println("Gear changed");
	}
	
}


class Honda extends Bikes {
	void run() {
	System.out.println("Running Safely..");
	
	}
}

public class AbsMethod_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bikes bs = new Honda();
		bs.changeGear();
		bs.run();

	}

}
