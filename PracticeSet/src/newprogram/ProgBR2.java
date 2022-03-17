package newprogram;
import java.io.*;

public class ProgBR2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
int a,b,c,sum;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the value for a:");
a=Integer.parseInt(br.readLine());

System.out.println("Enter the value for b:");
b=Integer.parseInt(br.readLine());

System.out.println("Enter the value for c:");
c=Integer.parseInt(br.readLine());

sum = a+b+c;
System.out.println("The sum is :"+ sum);
          
	}

}
