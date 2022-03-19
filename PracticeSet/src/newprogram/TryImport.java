package newprogram;

//Java program to demonstrate the 
//working of a program
//without any import statement
public class TryImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring an ArrayList of String type
		
   //  ArrayList<String> arrayList = new ArrayList<String>();
     
      /* NOTE: ArrayList class is a part of the java.util package.                               
        So we need need to include the ArrayList class defined under
        Java.util package in our program.*/
           
        // Adding elements in the ArrayList
        //arrayList.add("Hey");
        //arrayList.add("hi");
        //arrayList.add("hello");
        // Print the ArrayList
       // System.out.println("ArrayList: " + arrayList); */
	
		
		
		//METHOD-1
		 // Using fully-qualified name
        // Declaring an ArrayList of String type
        java.util.ArrayList<String> arrayList = new java.util.ArrayList<String>();
  
        // Adding elements in the ArrayList
        arrayList.add("Heyy");
        arrayList.add("Hiii");
        arrayList.add("Hello");
  
        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);	
	}
}