package newprogram;

public class Nested_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i =10,j=12,k=14,largest;

if(i>=j) {
	if (i>=k) {
		largest=i;
	}

	else {
		largest=k;
	}
}
else {

if(j >=k) {
largest=j;
}
else  {
largest=k;
}
	}
System.out.println("The Largest number:" + largest);
}
}
