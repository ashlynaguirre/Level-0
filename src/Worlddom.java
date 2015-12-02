import javax.swing.JOptionPane;

public class Worlddom {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String ask = JOptionPane.showInputDialog( "Do you know how to write code? ");
		if(ask.equals("yes"));
		{ JOptionPane.showMessageDialog(null, " Then you will probably rule the world ");
		}
		else{ JOptionPane.showMessageDialog(null, " Then you're probably a loser lol bye ");
		}

		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	}
}
