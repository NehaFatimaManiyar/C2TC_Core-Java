package com.guiapps;
//25/04
class TContent {
	public synchronized void m1(String s) {
		System.out.println("{");
		System.out.println(s);
		try {
			Thread.sleep(200);
		}
		catch(Exception e){	
		}
		System.out.println("}");   //printing after the catch block
	}
}

class ThreadJob extends Thread {
	TContent t;
	String s;
	public ThreadJob(TContent t, String s) {
		this.t = t;
		this.s=s;
		t = new TContent();
		start();
		
	}
	public void run() {
		// TODO Auto-generated method stub
		t.m1(s);
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TContent t = new TContent();
 
       new ThreadJob(t,"Hello");
       new ThreadJob(t,"World");
       
	}

}
