package org.usfirst.frc.team5401.robot.subsystems;

import org.usfirst.frc.team5401.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LoaderRook extends Subsystem {

	private VictorSP MeteringPower;
	private VictorSP BeltPower;
	
	private double LOADER_ZOOM;
	private double METERING_ZOOM;
	private boolean active;
	
	public LoaderRook(){
		//Initialize Loader Motors
		MeteringPower = new VictorSP(RobotMap.METERING_MOVER);
		BeltPower = new VictorSP(RobotMap.JUMPER_BELT);
	
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
 
    public void runBeltsAndMeteringPower(){
    	active = true;
    	MeteringPower.set(METERING_ZOOM);
    	BeltPower.set(LOADER_ZOOM);
    }
    
    public void stopBeltsAndMeteringPower(){
    	active = false;
    	MeteringPower.set(0);
    	BeltPower.set(0);
    }
    public boolean isEnabled(){
    	return active;
    	
    }
    public void switchState(){
    if (!active){
    	runBeltsAndMeteringPower();
    } else {
    	stopBeltsAndMeteringPower();
    }
       
    }
}

