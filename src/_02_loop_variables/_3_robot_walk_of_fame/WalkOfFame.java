
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot mack = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
mack.setX(50);
mack.setSpeed(100);
		// 2. Make the robot draw a star shape. Hint: angle=144.
mack.penDown();

for (int mackAsInt=0; mackAsInt < 10; mackAsInt++) {
	for (int mackAsInt2=0; mackAsInt2 < 5; mackAsInt2++) {
		mack.move(30);
		mack.turn(144);
	}
	mack.setAngle(90);
	mack.penUp();
	mack.move(50);
	mack.penDown();
}

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
	       
		 * Hint: The distance between stars is 50.
		 */

mack.hide();
	}

}
