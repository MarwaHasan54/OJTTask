package com.javapapers.designpattern.observer;

//main class
public class S2clouckObserver {

	public static void main(String[] args) {
		
		//Defining modes
		ClouckMode mode1 = new ClouckMode(1);
		ClouckMode mode2 = new ClouckMode(2);
		ClouckMode mode3 = new ClouckMode(3);
		ClouckMode mode4 = new ClouckMode(4);
		
		//Defining modes
		ClouckButton b1 = new ClouckButton('A');
		ClouckButton b2 = new ClouckButton('B');
		ClouckButton b3 = new ClouckButton('C');

		//Note!!!!!! : Run each test line (pair: button and mode) separately.
		
		//first button and first mode 
		//b1.ActionIfA(mode1);
		
		//second button and first mode 
		//b2.ActionIfB(mode1);
		
		//third button and first mode 
		//b3.ActionIfC(mode1);
		
		//first button and second mode
		//b1.ActionIfA(mode2);
		
		//second button and second mode
		//b2.ActionIfB(mode2);
		
		//third button and second mode
		//b3.ActionIfC(mode2);
		
		//first button and third mode
		//b1.ActionIfA(mode3);
		
		//second button and third mode
		//b2.ActionIfB(mode3);
		
		//third button and third mode
	    //b3.ActionIfC(mode3);
		
		//first button and fourth mode
		//b1.ActionIfA(mode4);
		
		//second button and fourth mode
		//b2.ActionIfB(mode4);
		
		//third button and fourth mode
		//b3.ActionIfC(mode4);
		
	}
	
	
	
}
