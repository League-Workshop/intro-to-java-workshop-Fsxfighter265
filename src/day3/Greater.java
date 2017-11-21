package day3;
import javax.swing.JOptionPane;
public class Greater {

	public static void main(String[] args) {
		String name;
		String str = "Aidan";
		//JOptionPane.showMessageDialog(null, "Hello World!");
		name = JOptionPane.showInputDialog("What is your name?");
		//JOptionPane.showMessageDialog(null, "Hi " + name);
		

		if (str.equals(name))
			{
			JOptionPane.showMessageDialog(null, "Welcome " + name);	
			}
		else
			{
			JOptionPane.showMessageDialog(null, "Incorrect!");		
			}

	}

}
