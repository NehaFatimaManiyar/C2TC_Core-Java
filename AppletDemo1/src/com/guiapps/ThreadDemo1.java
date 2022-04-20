package com.guiapps;

public class ThreadDemo1 extends Thread  {
 public void run() {
	 System.out.println("My Thread");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Thread th = new ThreadDemo1();
  th.start();
  // th.getName();  //gives name to the thread by default by the jvm
 System.out.println(th.getName());
	}

}

