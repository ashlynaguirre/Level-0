import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String cat = JOptionPane.showInputDialog(" How many cats? ");
		// 2. Convert their answer into an int
int cats = Integer.parseInt(cat);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if (cats == 0) {
	playVideo("https://www.youtube.com/watch?v=k85mRPqvMbE");
	
}		
if (cats > 3) {
	JOptionPane.showMessageDialog(null, " you habe too many of the cat ");
}
		// 4. If they have 3 or less, call the method below to show them a cat video
if (cats <= 3) {
	playVideo("https://www.youtube.com/watch?v=_BRp7ezUqbI");
	
}

	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

