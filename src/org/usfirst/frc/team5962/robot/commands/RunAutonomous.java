package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.RobotMap;
import org.usfirst.frc.team5962.robot.subsystems.Autonomous;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class RunAutonomous extends Command {


	private Autonomous driveRobot = new Autonomous();
	private boolean isFinished = false;	


	protected void initialize(){
		Robot.gyro.resetGyro();
		RobotMap.myRobot.setMaxOutput(0.5);	
		
	}

//Make a clean class so they can't easily find initialize to keep the robot from moving at max speed
	//would also make it easier for students without experience because there would be less clutter.
	protected void execute() {
		//EXAMPLE SIMPLE CALLS 
		//Write up a description
		driveRobot.backwards(1, 100);
		driveRobot.forward(1, 10);
		driveRobot.turnLeft(0.5, 20);
		driveRobot.turnRight(0.5, 3);
		driveRobot.stop(1000);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
