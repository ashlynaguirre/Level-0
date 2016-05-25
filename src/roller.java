import javax.swing.JOptionPane;

public class roller {
public static void main(String[] args) {
	String howtall = JOptionPane.showInputDialog(" How tall are you? ");
int tall = Integer.parseInt(howtall);
if (tall <= 4) {
JOptionPane.showMessageDialog(null, " you are too short yo ");
}
if (tall >=5) {
	JOptionPane.showMessageDialog(null, " You can go on ");
}
}
}
