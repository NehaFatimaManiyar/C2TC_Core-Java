abstract class Bikes {
	Bikes(){
		System.out.println("Bikes");
	}
	
	abstract void run();
<<<<<<< Upstream, based on origin/master
	void changeGear() {
		System.out.println("Gear changed");
	}
	
}

=======
	
	void changeGear() {
		System.out.println("Gear changed");
	}
	
}
>>>>>>> bbe5137 first commit

class Honda extends Bikes {
	void run() {
	System.out.println("Running Safely..");
	
	}
}

public class AbsMethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bikes bs = new Honda();
bs.changeGear();
bs.run();

	}

}
