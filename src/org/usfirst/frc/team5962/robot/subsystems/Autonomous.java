package org.usfirst.frc.team5962.robot.subsystems;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
	public void forward(double power, int time){
		double angle = getGyroAngle();
		driveBase(power, time, -angle * 0.03);
	}
	public void turnLeft(double power, int time){
		driveBase(power, time, 1);
	}
	public void turnRight(double power, int time){
		driveBase(power, time, -1);
	}
	public void backwards(double power, int time){
		double angle = getGyroAngle();
		driveBase(-power, time, angle * 0.03);
	}
	public void stop(int time){
		driveBase(0, time, 0);
	}

	public void driveBase(double power, int time, double turningValue){
		long startSystemTime = System.currentTimeMillis(); //move outside function
		long currentTime = System.currentTimeMillis();
		if(currentTime < (startSystemTime + (time/1000))){
			RobotMap.myRobot.drive(-power, turningValue);
		}
	}
}