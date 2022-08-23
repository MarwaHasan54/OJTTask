package com.javapapers.designpattern.observer;

public class ClouckMode implements Observer {

	private int ModeNumber ;
	private Subject button ;
	
	//constructor
	public ClouckMode(int n) {
		setModeNumber(n);
	}
	
	//set function
	public void setModeNumber(int ModeNumber) {
		this.ModeNumber = ModeNumber;
	}

	//get function
	public int getModeNumber() {
		return this.ModeNumber;
	}
	

	public void setSubject(Subject subject) {
	     this.button = subject;
		
	}


}
