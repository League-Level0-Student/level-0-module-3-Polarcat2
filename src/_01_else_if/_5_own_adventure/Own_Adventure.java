package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Own_Adventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "One time, me and my freind decided to climb up a mountain.\n It was a dark, cloudy day. We took our supplies and started climbing up the steep rocks. Suddenly, it started to rain!\n We needed shelter, and I saw a cave near by.\n I told my freind that we could go stay in the cave and wait for the rain to stop, but she said we shoul go find shelter up at the top of the mountain.");
	String Go = JOptionPane.showInputDialog("Where should we go?");
	if (Go.equalsIgnoreCase("in the cave")) {
		JOptionPane.showMessageDialog(null, "We decided to take shelter in the cave because in was closer.\n As we walked inside, we noticed there was something liying on the ground.\n I looked down at whatever it was, and decided to touch it. It felt like scales... Suddenly, the creature let out a roar! A huge dragon emerged and swallowed them up.\n THE END");
	} else if (Go.equalsIgnoreCase("to the top of the mountain")) {
		JOptionPane.showMessageDialog(null, "We decided to go to the top of the mountain, because it was the safer option.\n When we got to the top, suddenly, a loud boom arose in the distance.\n It was thunder!\n We thought that there was nothing worse than this, but luck was never on our side.\n There was no shelter there and they were very vulnerable to the thunder. Just a few seconds later, a thunderbolt of lightning came straight towards them.\n In no time at all, they burned and died.\n THE END.");
	}  else {
		JOptionPane.showMessageDialog(null, "That is not an answerererererererererererererererererererererererererererererererererererer");
	}
}
}
