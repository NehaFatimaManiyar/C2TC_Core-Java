package com.Acess_Modifier;

public class PrivateAM {
private String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating an object of PrivateAM
		
		PrivateAM pa = new PrivateAM();
		
		// Accessing the private variable using the getter and setter
		pa.setName("Programming");
		System.out.println(pa.getName());
		
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
