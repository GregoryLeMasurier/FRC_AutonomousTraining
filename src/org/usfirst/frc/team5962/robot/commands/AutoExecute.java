package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.subsystems.Autonomous;

public class AutoExecute {
	
	public static Autonomous driveRobot = new Autonomous();
	
	public void execute(){
		
	driveRobot.backwards(1, 100);
	driveRobot.forward(1, 10);
	driveRobot.turnLeft(0.5, 20);
	driveRobot.turnRight(0.5, 3);
	driveRobot.stop(1000);
		
		
		
	}

}
