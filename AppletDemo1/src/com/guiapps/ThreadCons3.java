package com.guiapps;

//Thread (Runnable r)

class Thread1 implements Runnable {
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running.....");
	}
	
}

public class ThreadCons3 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Thread1());
		t.start();
			System.out.println("Thread Name:" + t.getName());
		
		
	}

}
