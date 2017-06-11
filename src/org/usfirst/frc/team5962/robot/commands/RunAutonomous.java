package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

public class RunAutonomous extends Command {

	private boolean isFinished = false;	


	protected void initialize(){
		Robot.gyro.resetGyro();
		RobotMap.myRobot.setMaxOutput(0.5);	
		//obj name speed time
		//arraylist check when done
		
	}

	protected void execute() {
		Robot.execute.execute();
		isFinished = true;
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isFinished;
	}

}
