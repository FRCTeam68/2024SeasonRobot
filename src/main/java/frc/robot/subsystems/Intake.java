package frc.robot.subsystems;

import com.ctre.phoenix6.controls.CoastOut;
import com.ctre.phoenix6.controls.StaticBrake;
import com.ctre.phoenix6.hardware.TalonFX;

import frc.robot.Constants;

public class Intake implements Subsystem{

    private State currentState = State.IDLE;

    private double speed = 0;

    private TalonFX shootMotor; //TODO: Initialize the motor

    public static enum State {
        SHOOTING,
        PICK_UP,
        IDLE
    }

    @Override
    public void processLoop(double timestamp) {
    switch (currentState) { // Maybe instead of calling this every loop, have it be a switched state function and that might save on space
        case SHOOTING:
            shootMotor.setControl(new StaticBrake()); 
            // Put on break mode because eh. Should take care of everything else with the setSpeed
            break;
        case PICK_UP:
            //Yea I honestly have no clue what goes here so this is for someone else
            break;
        case IDLE: // No break here on purpose. We can add IDLE specific things here but it will always run the default
            shootMotor.setControl(new CoastOut());
        default:
            setSpeed(0);
            break;
    }
    }

    @Override
    public void stop() {
        
    }

    public void setSpeed(double speed) {
        if (this.speed != speed) {
            this.speed = speed;
            shootMotor.set(speed/Constants.Shooter.maxSpeed);
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void changeState(State state) {
        if (currentState != state) {// Maybe try to get rid of this branching but for now its fine
            currentState = state;
            
        }
    }

    public State getState() {
        return currentState;
    }

    @Override
    public boolean checkSystem() {
        return true;
    }

    @Override
    public void zeroSensors() {
        
    }

    @Override
    public String getId() {
        return "Intake";
    }
    
}
