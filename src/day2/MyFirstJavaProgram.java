package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE

		String str = "end world!";
	    str = str.toUpperCase();
		System.out.println(str);
		String Boi = "gjl;fdkgjfdlk;gjfdlgjfd;lgjflk;gjfxdl;kbjdflk;gjdflk;gfds;lkgjdfsl;k";
		int Boii = Boi.length();
		System.out.println(Boii);

		
		System.out.println("Hello World");
		
		Robot myRobot = new Robot();
		myRobot.setRandomPenColor();
		myRobot.penDown();
		myRobot.setSpeed(1000);
		
		for (int i=1; i<40; i++) {
		myRobot.move(200);
	    myRobot.turn(90);
	    
		}
		
		
	}	
}
