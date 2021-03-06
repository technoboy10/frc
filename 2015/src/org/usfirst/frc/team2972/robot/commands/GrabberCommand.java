package org.usfirst.frc.team2972.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2972.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 *
 */
public class GrabberCommand extends CommandBase {

	private int direction;
	private boolean isDone = false;
	
    public GrabberCommand(int dir) {
    	super("GrabberCommand");
        requires(grabber);
        direction = dir;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (direction == 1) {
    	grabber.open();
    	} else if (direction == -1) {
    	grabber.close();
    	} else {
    	grabber.stop();
    	}
    	isDone = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isDone;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
