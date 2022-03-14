import java.util.Scanner;
public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float Total=500.0f;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks for Each Subjects");
		System.out.println("Enter marks for sub 1:");
		int a= sc.nextInt();
		System.out.println("Enter marks for sub 2:");
		int b= sc.nextInt();
		System.out.println("Enter marks for sub 3:");
		int c= sc.nextInt();
		System.out.println("Enter marks for sub 4:");
		int d= sc.nextInt();
		System.out.println("Enter marks for sub 5:");
		int e= sc.nextInt();
		int sum = a+b+c+d+e;
		System.out.println("The Total marks is : "+ sum);
		float calc= sum/Total*100;
		System.out.println("The total percentage is :"+ calc );	

	}

}
