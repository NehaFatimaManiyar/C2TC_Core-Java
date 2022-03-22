import java.util.Scanner;
public class ConvertKmToMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float miles = 0.621371f; // 1km(s)=0.62137 Miles(s)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of distance in Km to get the Distance in Miles:");
		float km = sc.nextFloat();
		float convert = (km * miles); 
		System.out.println("The conversion is : " + convert + " Miles");
sc.close();
	}
}
