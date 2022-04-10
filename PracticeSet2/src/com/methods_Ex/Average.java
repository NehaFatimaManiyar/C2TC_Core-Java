package com.methods_Ex;

public class Average {
int x = 4 , y = 8 , z=14;

void CalcAvg() {
	int Avg = (x+y+z)/3;
	System.out.println(" The average is :" + Avg);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Average av = new Average();
     av.CalcAvg();
	}

}
