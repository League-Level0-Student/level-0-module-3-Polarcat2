
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		for (int i = 0; i < 100; i++) {
			
		Robot Mango = new Robot("mini");
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		Mango.setSpeed(100);
		Mango.penDown();
		//3. Set the pen width to 10
	Mango.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color= JOptionPane.showInputDialog("What color pen do you want Mango to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("red") ) {
			Mango.setPenColor(Color.red);}
		else if (color.equalsIgnoreCase("blue") ) {
            Mango.setPenColor(Color.blue);}
		else if (color.equalsIgnoreCase("yellow") ) {
			Mango.setPenColor(Color.yellow);}
		
        //6. If the user doesn't enter anything, choose a random color
	     else {
		Mango.setRandomPenColor();
	} 
	Mango.move(100);
	Mango.turn(50);
	Mango.move(100);
	Mango.turn(50);
	Mango.move(100);
	Mango.turn(50);
	Mango.move(100);
	Mango.turn(50);
	Mango.move(100);
	Mango.turn(50);
	Mango.move(100);
	Mango.turn(50);
	Mango.move(100);	
		}
	
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
	}
		



	}

