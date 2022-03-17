package newprogram;
import java.io.*;
public class progBR3 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		char[] array = new char[100];

	   

	      // Creates a BufferedReader
	      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	      // Reads characters
	      input.read(array);
	      System.out.println("Data Entered is: ");
	      System.out.println(array);

	   
	    }


	}


