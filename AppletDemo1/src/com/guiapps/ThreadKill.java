package com.guiapps;

public class ThreadKill extends Thread {
	// Declare a static variable to of type Thread.
	   static Thread t;	

	public void run()
	{
	 System.out.println("Thread is running");	
	 t.stop(); // Calling stop() method on Kill Thread.
	 System.out.println("is it Running...........!!!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ThreadKill k = new ThreadKill();
		  t = new Thread(k);
		  t.start(); // Calling start() method.
	}

}
