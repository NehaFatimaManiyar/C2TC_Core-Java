package newprogram;
import java.io.*;
public class ProgBR {

			public static void main(String[] args)  throws IOException {
				// TODO Auto-generated method stub
				int a;
				BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
				
				System.out.println("Enter any number: ");
				a = Integer.parseInt(in.readLine());
				
				System.out.println("You entered : " + a );
				
				}
				

			}

