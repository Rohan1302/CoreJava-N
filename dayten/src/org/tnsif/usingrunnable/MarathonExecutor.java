package org.tnsif.usingrunnable;
//driver class
//program to demonstrate on runnable interface for thread
public class MarathonExecutor {

	public static void main(String[] args) {
		Marathon m=new Marathon();
		m.setSpeed(40);
		m.setCity("Pune");
		m.run();

	}

}
