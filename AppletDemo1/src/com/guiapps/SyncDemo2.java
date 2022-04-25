package com.guiapps;
class A implements Runnable {
	public synchronized void run() {
		int i;
		for(i=0; i<=10; i++) {
		System.out.println("Thread A:" + i);
		
		}
	}
}

class B implements Runnable {
public void  run() {
	int i;
	for(i=0; i<=10; i++) {
   // System.out.println(" ");
	System.out.println("Thread B:" + i);
	}
	}
}

public class SyncDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Thread th1 = new Thread(new A());
     th1.start();
     Thread th2 = new Thread(new B());
     th2.start();
	}

}
