package org.usfirst.frc.team5401.robot.subsystems;

import org.usfirst.frc.team5401.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gerz extends Subsystem {
	
	private DoubleSolenoid GerzBoi;
	//private DoubleSolenoid GerzBoiz;
	
	public Gerz(){
		GerzBoi = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.GEAR_MANIPULATOR_IN, RobotMap.GEAR_MANIPULATOR_OUT);
		//GerzBoiz = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.GEAR_MANIPULATOR_IN, RobotMap.GEAR_MANIPULATOR_OUT);

		
		
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void gearInOut(int axis){
    	    if (axis == 1) {
    	    	GerzBoi.set(DoubleSolenoid.Value.kForward);
    	    //	GerzBoiz.set(DoubleSolenoid.Value.kForward);
    	    } else if (axis == -1) {
    	    	GerzBoi.set(DoubleSolenoid.Value.kReverse);
    	    //	GerzBoiz.set(DoubleSolenoid.Value.kReverse);
    	    } else {
    	    	GerzBoi.set(DoubleSolenoid.Value.kOff);
    	    //	GerzBoiz.set(DoubleSolenoid.Value.kOff);
    	    }
    }
}

