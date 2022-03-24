abstract class Bike {  //Defining Abstract class
	abstract void run();//abstract method run();
	
}

class Royal_Enfield_Bullet_350 extends Bike {
	
	@Override
	void run() {  //overriding the abstract method for implementation
	System.out.println("Go slow & run Safely....");
		
	}
}


public class Absmethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bike bk = new Royal_Enfield_Bullet_350();
     bk.run();
     
	}

}

