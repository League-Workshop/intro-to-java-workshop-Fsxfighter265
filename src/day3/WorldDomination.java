package day3;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String awnser;
		awnser = JOptionPane.showInputDialog("Are you going to rule the world?");
		// 2. If they say "yes", tell them they will rule the world.
		
		if(awnser.equals("yes"))
		{
			JOptionPane.showMessageDialog(null, "Good for you, you can rule the world over your dishes");
		// 3. Otherwise, wish them good luck washing dishes.
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Good luck to wash you piles of Dishes!");
		}

		
		
	}
}

