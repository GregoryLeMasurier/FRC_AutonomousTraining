package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.subsystems.Autonomous;

public class AutoExecute {
	public static Autonomous driveRobot = new Autonomous();

	public void init() {
		/*
		 * If you want to move the robot forwards type:
		 * driveRobot.forward(speed, time); Speed is any number from -1 to 1 and
		 * time is the time in seconds that you would like to move forwards.
		 * 
		 * If you want to move the robot backwards type:
		 * driveRobot.backwards(speed, time); Speed is any number from -1 to 1
		 * and time is the time in seconds that you would like to move forwards.
		 * 
		 * If you want to turn the robot to the left type:
		 * driveRobot.turnLeft(speed, time); Speed is any number from -1 to 1
		 * and time is the time in seconds that you would like to move forwards.
		 * 
		 * If you want to turn the robot to the right type:
		 * driveRobot.turnRight(speed, time); Speed is any number from -1 to 1
		 * and time is the time in seconds that you would like to move forwards.
		 * 
		 * If you want to stop the robot type: driveRobot.stop(time); Time is
		 * the time in seconds that you would like to move forwards.
		 * 
		 * Enter your code below:
		 */

		// TODO: Remove the test commands below.
		driveRobot.backwards(1, 100);
		driveRobot.forward(1, 10);
		driveRobot.turnLeft(0.5, 20);
		driveRobot.turnRight(0.5, 3);
		driveRobot.stop(1000);
	}
}