package org.usfirst.frc.team5962.robot.subsystems;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Autonomous extends Subsystem  {

	private double getGyroAngle() {
		double angle = Robot.gyro.getGyroAngle();
		return angle;
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	
	//Need to test the turning angles might need to switch which is negative
	public void forward(double speed, int time){
		double angle = getGyroAngle();
		driveBase(speed, time, -angle * 0.03, System.currentTimeMillis());
	}
	public void turnLeft(double speed, int time){
		driveBase(speed, time, 1, System.currentTimeMillis());
	}
	public void turnRight(double speed, int time){
		driveBase(speed, time, -1, System.currentTimeMillis());
	}
	public void backwards(double speed, int time){
		double angle = getGyroAngle();
		driveBase(-speed, time, angle * 0.03, System.currentTimeMillis());
	}
	public void stop(int time){
		driveBase(0, time, 0, System.currentTimeMillis());
	}

	public void driveBase(double power, int time, double turningValue, long startSystemTime){
		long currentTime = System.currentTimeMillis();
		if(currentTime < (startSystemTime + (time/1000))){
			RobotMap.myRobot.drive(-power, turningValue);
		}
		else{
			RobotMap.myRobot.drive(0, 0);
		}
	}
}