package com.guiapps;

//Using Thread(String str)

public class ThreadCons2 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Thread t = new Thread("My Thread");
		t.start();
			System.out.println("Thread Name:" + t.getName());
		
		
		
		
	}

}
