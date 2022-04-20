package com.guiapps;
//Thread (Runnable r, String r)

class Thread2 implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Doing a task");
	}
	
}


public class ThreadCons4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Thread1(), "New Thread");
		t.start();
			System.out.println("Thread Name:" + t.getName());
		
		
	}

}
