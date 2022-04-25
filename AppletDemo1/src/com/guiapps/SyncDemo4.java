package com.guiapps;
class S implements Runnable {
	 int age = 22;
	    public void run ()
	    {
	        synchronized (this)
	        {
	            Thread t = Thread.currentThread ();
	            String name = t.getName ();
	            System.out.println ("Name is "  + name);
	            System.out.println("Age is " + age);
	            age++;
	        }
	    }
}
public class SyncDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 S s1 = new S ();
	        Thread t1 = new Thread (s1);
	        Thread t2 = new Thread (s1);
	        Thread t3 = new Thread (s1);
	        t1.setName ("Neha");
	        t2.setName ("Fatima");
	        t3.setName ("Ibad");
	        t1.start ();
	        t2.start ();
	        t3.start ();
	}

}
