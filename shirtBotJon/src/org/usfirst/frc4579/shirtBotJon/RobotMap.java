// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4579.shirtBotJon;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainleftFront;
    public static SpeedController driveTrainleftBack;
    public static SpeedController driveTrainrightFront;
    public static SpeedController driveTrainrightBack;
    public static AnalogGyro driveTraindriveGyro;
    public static AnalogPotentiometer aimerpotentiometer;
    public static SpeedController aimeraimController;
    public static Relay shooterRelaySolenoid1;
    public static DigitalInput shooterupperLimitSwitch;
    public static DigitalInput shooterLimitSwitch2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainleftFront = new Talon(0);
        LiveWindow.addActuator("driveTrain", "leftFront", (Talon) driveTrainleftFront);
        
        driveTrainleftBack = new Talon(1);
        LiveWindow.addActuator("driveTrain", "leftBack", (Talon) driveTrainleftBack);
        
        driveTrainrightFront = new Talon(2);
        LiveWindow.addActuator("driveTrain", "rightFront", (Talon) driveTrainrightFront);
        
        driveTrainrightBack = new Talon(3);
        LiveWindow.addActuator("driveTrain", "rightBack", (Talon) driveTrainrightBack);
        
        driveTraindriveGyro = new AnalogGyro(0);
        LiveWindow.addSensor("driveTrain", "driveGyro", driveTraindriveGyro);
        driveTraindriveGyro.setSensitivity(0.007);
        aimerpotentiometer = new AnalogPotentiometer(1, 1.0, 0.0);
        LiveWindow.addSensor("aimer", "potentiometer", aimerpotentiometer);
        
        aimeraimController = new Talon(4);
        LiveWindow.addActuator("aimer", "aimController", (Talon) aimeraimController);
        
        shooterRelaySolenoid1 = new Relay(0);
        LiveWindow.addActuator("shooter", "Relay Solenoid 1", shooterRelaySolenoid1);
        
        shooterupperLimitSwitch = new DigitalInput(0);
        LiveWindow.addSensor("shooter", "upperLimitSwitch", shooterupperLimitSwitch);
        
        shooterLimitSwitch2 = new DigitalInput(1);
        LiveWindow.addSensor("shooter", "Limit Switch 2", shooterLimitSwitch2);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
