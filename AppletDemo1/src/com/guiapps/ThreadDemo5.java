package com.guiapps;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo5 extends Frame {

	TextField t1,t2;
	int i,j;
	
	public ThreadDemo5(){
		setLayout(new FlowLayout());
		
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		
	    F f =new F(this);
		f.start();
		
		D d =new D(this);
		d.start();
		
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
			
		});
		setSize(30,400);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new ThreadDemo5();
	}

    }

class F extends Thread {
	ThreadDemo5 thf1;
	F(ThreadDemo5 thf1)
	{
		this.thf1=thf1;
		
	}
	public void run() {
		while(true)
		{
			
		    thf1.t1.setText(String.valueOf(thf1.i));
			if(thf1.i==100)
				thf1.i=0;
			else
				thf1.i++;
		}
	}
		
	}	
	

class D extends Thread
{
	ThreadDemo5 thf2;
	D(ThreadDemo5 thf2)
	{
		this.thf2=thf2;
		
	}
	
public void run() 
{
	
	while(true)
	{
		
	      thf2.t2.setText(String.valueOf(thf2.j));
		if(thf2.j==100)
			thf2.j=0;
		else
			thf2.j++;
	}
      }
	}



