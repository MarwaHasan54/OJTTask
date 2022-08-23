package com.javapapers.designpattern.observer;
import java.util.Date;  
import java.text.Format;  
import java.text.SimpleDateFormat;

// buttons class
public class ClouckButton implements Subject {

	private char buttonChar ;
	Timer t = new Timer();
	Date d = new Date();

	//constructor
	public ClouckButton(char c) {
		setButtonChar(c);
	}

	//set function
	public void setButtonChar(char Bchar) {
		this.buttonChar = Bchar;
	}

	//get function
	public char getButtonChar() {
		return this.buttonChar;
	}

	//button A
	public void ActionIfA(Observer O) {
		if (O.getModeNumber()==1) {
			System.out.println("the mode changed to 2");
			O.setModeNumber(2);
		}
		else
			if (O.getModeNumber()==2) {
				System.out.println("the mode changed to 3");
				O.setModeNumber(3);
			}
			else
				if (O.getModeNumber()==3) {
					System.out.println("the mode changed to 4");
					O.setModeNumber(4);
				}
				else
					if (O.getModeNumber()==4) {
						System.out.println("the mode changed to 1");
						O.setModeNumber(1);
					}

					else {
						System.out.println("the mode number is invalid");
					}


	}
	
	//button B cases
	public void ActionIfB(Observer O) {
		if(O.getModeNumber()==1) {
			SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm aa");
			String time = formatTime.format(d);
			System.out.println("Current Time in AM/PM Format is : " + time);


		}
		if(O.getModeNumber()==2) {
			int year = d.getYear();
			System.out.println("Year : "+(year+1900));

		}
		if(O.getModeNumber()==3) {
			System.out.print("inital mode : ");
			t.initalMode();
			t.printTimer();
			System.out.print("start mode : ");
			t.startMode();
			t.printTimer();
			System.out.print("pause mode : ");
			t.pauseMode();
			t.printTimer();
			System.out.print("resume mode : ");
			t.resumeMode();
			t.printTimer();

		}
		if(O.getModeNumber()==4) {
			System.out.println("The One s2!");

		}

	}

	//button C cases
	public void ActionIfC(Observer O) {

		if (O.getModeNumber()==1) {
			System.out.println("Light");
		}

		if (O.getModeNumber()==2) {
			Format f = new SimpleDateFormat("EEEE");  
			String str = f.format(new Date()); 
			System.out.println("Day Name: "+str);

		}
		if (O.getModeNumber()==3) {
			t.initalMode();
			System.out.println("resetting the timer");
			t.printTimer();
		}

		if (O.getModeNumber()==4) {
			System.out.println("nothing changed");

		}

	}

	//timer class 
	public static class Timer {
		int hour ;
		int minute ;
		int secound;


		public Timer() {
			hour=00;
			minute=00;
			secound=00;
		}

		public void printTimer() {
			System.out.println(hour+":"+minute+":"+secound);
		}

		public void initalMode() {
			hour=00;
			minute=00;
			secound=00;
		}

		public void startMode() {
			hour=00;
			minute=00;
			secound=01;
		}

		public void pauseMode() {
			hour=00;
			minute=00;
			secound=01;
		}
		public void resumeMode() {
			hour=00;
			minute=00;
			secound=02;
		}
	}

}
