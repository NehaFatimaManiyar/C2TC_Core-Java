package com.guiapps;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

	 
 public class ThreadDemo3_Outer extends Frame  { 
	 TextField t1,t2;
	 Thread th1,th2;
	 int i,j;
	 
	 public ThreadDemo3_Outer ()
		{
			setLayout(new FlowLayout());
			
			add(t1 = new TextField(20));
			add(t2 = new TextField(20));
			
			T b = new T(this);
			C c = new C(this);
			
			b.start();
			c.start();
			
			addWindowListener(new WindowAdapter() 
			{
				@Override
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
			
			setSize(300, 300);
			setVisible(true);
		}
		public static void main(String[] args) 
		{
			new ThreadDemo3_Outer();
		}

	}
	class T extends Thread
	{
		ThreadDemo3_Outer thf1;
		
		T(ThreadDemo3_Outer thf1)
		{
			this.thf1 = thf1;
		}
		public void run()
		{
			while(true)
			{
				thf1.t1.setText(String.valueOf(thf1.i));
				
				if(thf1.i==100)
					thf1.i =0;
				else
					thf1.i++;
				
				try
				{
					Thread.sleep(10);
				}
				catch(Exception e)
				{	
				}
			}
		}
	}
	class C extends Thread
	{
		ThreadDemo3_Outer thf2;
		
		C(ThreadDemo3_Outer thf2)
		{
			this.thf2 = thf2;
		}
		public void run()
		{
			while(true)
			{
				thf2.t2.setText(String.valueOf(thf2.j));
				if(thf2.j==100)
					thf2.j =0;
				else
					thf2.j++;
				
				try
				{
					Thread.sleep(10);
				}
				catch(Exception e)
				{	
				}
			}
		}
	}

	
	