package org.tnsif.customexception;
//Parameterized constructor
public class LoginCredential extends Exception{
	//data members
	private String str;

	public LoginCredential(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredential [str=" + str + "]";
	}
		
}
	
