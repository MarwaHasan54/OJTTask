package com.javapapers.designpattern.observer;

public interface Subject {

	
	public void setButtonChar(char Bchar);
	
	public char getButtonChar();
	
	public void ActionIfA(Observer O);
	
	public void ActionIfB(Observer O);
	
	public void ActionIfC(Observer O);

	
}
