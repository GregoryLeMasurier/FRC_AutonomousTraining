# FRC_BasicSoftwareTraining

THIS IS NOT TESTED AND IS NOT CURRENTLY WORKING

This version of the software training is an improvement to the 2016 software training because it provides the students with easy to use
method calls that will allow them to move a robot from a starting square, marked with tape, to an ending square. Simple function calls
allow for students without software experience to easily pick up and understand very basics of programming with a quick sense of
accomplishment when they can get the robot to move within minutes. 

Examples of function calls:
  driveRobot.backwards(speed, time); //Robot moves backwards at the given speed(double from -1 to 1) for time (int) seconds
  driveRobot.forward(speed, time);   //Robot moves forwards at the given speed(double from -1 to 1) for time (int) seconds
  driveRobot.turnLeft(speed, time);  //Robot turns to the left at the given speed(double from -1 to 1) for time (int) seconds
  driveRobot.turnRight(speed, time); //Robot turns to the right at the given speed(double from -1 to 1) for time (int) seconds
  driveRobot.stop(time);             //Robot stops for time (int) seconds
  
  These commands are currently entered into the execute method in runAutonomous.
  
  Future changes
  1. A new class will be created for the user to enter the functions into which will make the working environment cleaner for the user 
    and will prevent the students from easily changing the max speed of the robot.
  2. Need to add support to select if the robot is running on talons or victors.
  3. Need to fix the time conversion in the driveRobot method in the Autonomous subsystem.
  4. Need to test the right and left turning values. Might need to swap them.
  5. Need to clean up the repository there are duplicates/classes that are not needed.
  
