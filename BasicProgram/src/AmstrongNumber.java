import java.lang.*;
public class AmstrongNumber {
	
	static boolean armstrong(int num) {
		int temp=0, count=0,last=0;
		double sum=0;
		temp=num;
		
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		
		temp = num;
		
		while(temp>0) {
			last = temp%10; //1534%10 =4 
			sum = sum+ Math.pow(last,count); //0+ 4^3 = 0+64=64
			temp=temp/10;
		}
		if(num==sum) {
			return true;
			
		}
		else 
			return false;
	}
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
 int num=153;
 System.out.println("The number is "+ num);
 if(armstrong(num)) {
	 System.out.println(" 153 is Armstrong number");
 }
 else {
	System.out.println("153 is not Armstrong number");
 }
	}

}
