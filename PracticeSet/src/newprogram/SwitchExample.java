package newprogram;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number = 2 ;
    switch(number) {
    case 0:System.out.println("Number is 0");
    break;
    case 1:System.out.println("Number is 1");	
    break;
    case 2:
    case 3: System.out.println("The number is either 2 or 3");
    break;
    default:
    	System.out.println("Number is less than 0 or greater than 3");
    break;
    }
	}

}
