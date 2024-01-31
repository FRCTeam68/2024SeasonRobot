package frc.robot;

import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

public class Robot extends TimedRobot {

    public static RobotContainer robotContainer;

    public static XboxController driveController;
    public static PS4Controller manipController;


    @Override
    public void robotInit(){
        robotContainer = new RobotContainer(); // MUST CALL FIRST. INITIALIZES CONTROLLERS
        robotContainer.startSubsystemThreads();

        driveController = new XboxController(Constants.Controllers.driveID); //TODO: Change port
        manipController = new PS4Controller(Constants.Controllers.manipID);

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

    public void checkControls() {
        if (manipController.getCircleButton()){
            // TAKE NOTE
        }

        if (manipController.getCrossButton()){
            // INTAKE STOP
        }

        if (manipController.getL2Button()) {
            // SHOOT
        }
    }
}
