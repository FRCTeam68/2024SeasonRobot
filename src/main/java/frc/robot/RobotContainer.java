package frc.robot;

import frc.robot.loops.SubsystemManager;
import frc.robot.subsystems.Intake;

public class RobotContainer {

    private static RobotContainer INSTANCE;

    private final SubsystemManager manager;
	public final Intake m_intake;

	public enum EnableState {
		DISABLED,
		AUTON,
		TELEOP
	}

	public EnableState enableState = EnableState.DISABLED;

	/**
	 * The container for the robot. Contains subsystems, OI devices, and commands.
	 */
	public RobotContainer() {
		INSTANCE = this;


		manager = new SubsystemManager(Constants.loopLengthSeconds);
		m_intake = new Intake();
		manager.setSubsystems(m_intake);
	}

	

	public static synchronized RobotContainer getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new RobotContainer();
		}
		return INSTANCE;
	}

	public void startSubsystemThreads(){
		manager.start();
	}

	public void stopSubsystemThreads(){
		manager.stop();
	}

	public void checkSubsystems() {
		manager.checkSubsystems();
	}

	public void stopSubsystems() {

		manager.stopSubsystems();
	}
    
}
