package com.guiapps;

public class ThreadCons1 extends Thread{
     
	public void run() {
		System.out.println("The thread is running.....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ThreadCons1 th = new ThreadCons1();
    th.getName();
   th.start();
    }

}
