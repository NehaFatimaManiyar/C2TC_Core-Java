package com.guiapps;


class R implements Runnable{
	public R(String name , int i) {
   
	}

	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println("Print the name and the age");
	}
}
public class SyncDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Thread t = new Thread(new R("Neha", 22));
     // new R("Neha",22);
      System.out.println(t);
      t.start();
	}

}
