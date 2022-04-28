package com.guiapps;

public class ThreadSleep implements Runnable {
	public void run()
	{
	  System.out.println("Hello");	
	try
	{
	 Thread.sleep(2000); // Pausing running thread for 2 sec.
	}
	catch(InterruptedException ie){
	 System.out.println(ie.getMessage());	
	 }
	System.out.println("still active");
	 System.out.println(Thread.currentThread());
	 }
	void m1()
	{
	 System.out.println("method m1( )");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSleep sp = new ThreadSleep();
		Thread t = new Thread(sp, "Child Thread");
		 t.start();
		 System.out.println("Number of active threads: " +Thread.activeCount());
		 sp.m1();
	}

}
