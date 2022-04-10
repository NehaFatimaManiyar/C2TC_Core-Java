package com.constructorEx;

public class Consload {
 String name;
 int Qty;
 int price;
 
 Consload(String x, int q, int p){ //constructor1
	 name = x;
	 Qty = q;
	 price = p;
	 
 }
 
 Consload(int qt,String n, int pr){ //constructor2
	 name = n;
	 Qty = qt;
	 price = pr;
	 
	 
 }
 Consload(int pri,int qnt,String nm){ //constructor3
	 name = nm;
	 Qty = qnt;
	 price = pri;
	 
	 
 }
 void print() {
	 System.out.println("Product Name:" + name );
	 System.out.println("Quantity:" + Qty);
	 System.out.println("Price :" + price );
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consload cl1 = new Consload("Grapes",40,3);
cl1.print();
Consload cl2 = new Consload(6,"Apple",30);
cl2.print();

Consload cl3 = new Consload(110,7,"Watermellon");
cl3.print();


	}

}
