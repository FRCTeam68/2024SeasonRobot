package frc.robot;

import com.ctre.phoenix6.SignalLogger;

import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

    public static RobotContainer robotContainer;

    @Override
    public void robotInit(){
        robotContainer = new RobotContainer(); // MUST CALL FIRST. INITIALIZES CONTROLLERS
        robotContainer.startSubsystemThreads();

    // Explicitly start the logger
    }



    @Override
    public void autonomousInit(){

    }


    @Override
    public void teleopInit(){
        
    }

    @Override
    public void simulationInit(){
    }

    @Override
    public void disabledInit(){

    }

    @Override
    public void robotPeriodic(){
        
    }

        
    @Override
    public void autonomousPeriodic(){

    }

    @Override
    public void teleopPeriodic() {

    }

    @Override
    public void simulationPeriodic() {

    }

    @Override
    public void disabledPeriodic(){

    }

    @Override
    public void autonomousExit(){

    }

    @Override
    public void teleopExit(){

    }

    @Override
    public void disabledExit(){

    }
}
