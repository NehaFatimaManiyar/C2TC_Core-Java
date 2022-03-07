
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int num = 87654,reverse = 0;
	while(num!=0) {
		int remainder = num%10;
		reverse = reverse*10 + remainder;
		num = num/10;
	}
 if(reverse==num) {
	 System.out.println(num + "is a palindrome");
 }
 else {
	 System.out.println(num + "is not a palindrome");
 }
	}

}
