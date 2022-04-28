package com.guiapps;

public class ThreadPrior2 implements Runnable {
	public void run()
	{
	  System.out.println(Thread.currentThread()); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPrior2 tp2 = new ThreadPrior2();
		 Thread t = new Thread(tp2, "NewThread");
		 t.setPriority(2); // Setting the priority of thread.
		 
		 System.out.println("Priority of Thread: " +t.getPriority());
		 System.out.println("Name of Thread: " +t.getName());
		 t.start();
	}

}
