package com.guiapps;

public class ThreadPrior implements Runnable{
	public void run()
	{
	  System.out.println(Thread.currentThread()); // This method is static.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPrior tp = new ThreadPrior();
		 Thread t = new Thread(tp, "NewThread");
		 
		 System.out.println("Priority of Thread: " +t.getPriority());
		 System.out.println("Name of Thread: " +t.getName());
		 t.start();
	}

}
