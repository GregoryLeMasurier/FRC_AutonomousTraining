package org.usfirst.frc.team5962.robot.subsystems;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.RobotMap;
import org.usfirst.frc.team5962.robot.commands.Item;
import org.usfirst.frc.team5962.robot.commands.RunAutonomous;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Autonomous extends Subsystem {

	private double getGyroAngle() {
		double angle = Robot.gyro.getGyroAngle();
		return angle;
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	// TODO: Need to test the turning angles might need to switch which is
	// negative
	public void forward(double speed, int time) {
		double angle = getGyroAngle();
		Item item = new Item(speed, time, -angle * 0.03);
		RunAutonomous.addCommand(item);
	}

	public void turnLeft(double speed, int time) {
		Item item = new Item(speed, time, 1);
		RunAutonomous.addCommand(item);
	}

	public void turnRight(double speed, int time) {
		Item item = new Item(speed, time, -1);
		RunAutonomous.addCommand(item);
	}

	public void backwards(double speed, int time) {
		double angle = getGyroAngle();
		Item item = new Item(speed, time, angle * 0.03);
		RunAutonomous.addCommand(item);
	}

	public void stop(int time) {
		Item item = new Item(0, time, 0);
		RunAutonomous.addCommand(item);
	}

	public void driveBase(double power, int time, double turningValue, long startSystemTime) {
		long currentTime = System.currentTimeMillis();
		if (currentTime < (startSystemTime + (time / 1000))) {
			RobotMap.myRobot.drive(-power, turningValue);
		} else {
			RobotMap.myRobot.drive(0, 0);
		}
	}
}