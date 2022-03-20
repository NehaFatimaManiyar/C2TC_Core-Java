package newprogram;

public class ExStatic { 
	
	static void EvenOdd(int num) { //using Static method
		
		if(num%2==0) 
		System.out.println("The given number " + num + " is is Even.");
		
		else 
		System.out.println("The given number " + num + " is Odd.");
		
		}
	
	void DispStatic() { // using non static method 
		int a=1,b=3, sum;
		sum = ( a + b);
		System.out.println("The sum of the numbers is:" + sum);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ExStatic.EvenOdd(9);
    ExStatic st =new ExStatic();
    		st.DispStatic();
     
	}
	}
