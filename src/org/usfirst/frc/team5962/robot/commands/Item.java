package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.RobotMap;

public class Item {

	public enum Direction {
		forwards, backwards, turnLeft, turnRight, stop
	};

	private double speed;
	private int time;
	private boolean complete = true;
	private long startSystemTime = -1;
	private double turningValue;

	public Item(double speed, int time, double turningValue) {
		complete = false;
		this.speed = speed;
		this.time = time;
		this.turningValue = turningValue;
	}

	public boolean isComplete() {

		return complete;
	}

	public void execute() {
		if (complete) {
			return;
		}
		if (startSystemTime == -1) {
			startSystemTime = System.currentTimeMillis();
		}
		long currentTime = System.currentTimeMillis();
		if (currentTime < (startSystemTime + (time / 1000))) {
			RobotMap.myRobot.drive(-speed, turningValue);
		} else {
			RobotMap.myRobot.drive(0, 0);
			complete = true;
		}
	}
}