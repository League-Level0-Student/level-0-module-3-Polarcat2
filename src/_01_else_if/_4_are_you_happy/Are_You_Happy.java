package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_You_Happy {
	public static void main(String[] args) {
		String Happy = JOptionPane.showInputDialog("Are you happy?");
		if (Happy.equalsIgnoreCase("no")) {
			Happy = JOptionPane.showInputDialog("Do you want to be happy?");
			if (Happy.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever youre doing.");
			}
		}
		if (Happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "keep doing whatever youre doing.");
		}
	}
}
