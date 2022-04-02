package newprogram;

public class NestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String username = "John";
String password = "12345";
if (username=="John") {   //Outermost if else condition BEGINS
	
	if(password=="12345") {  //Innermost if else condition BEGINS

		System.out.println("Login Successful");
	}
	else {
		System.out.println("Incorrect Password");
	     }  //Inner if else condition ENDS
    }  
	else {
		System.out.println("User Not Found");
	     }   //Outermost if else condition ENDS 

}

	}

