package com.guiapps;

public class ThreadDemo_ implements Runnable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ThreadDemo_ th = new ThreadDemo_();
		Thread t = new Thread(new ThreadDemo_());
		t.start();
	    System.out.println(t.getName());
	}
    public void run() {
	    System.out.println("Neha");
         }
	}

