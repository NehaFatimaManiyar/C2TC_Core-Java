import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What is your full name?");
		Scanner sc = new Scanner(System.in);
		String strname= sc.nextLine();
		System.out.println("Hello " + strname + " Have a good Day!! n:) ");

	}

}
