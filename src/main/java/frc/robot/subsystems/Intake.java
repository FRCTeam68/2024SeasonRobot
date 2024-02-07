package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import frc.robot.Constants;

public class Intake implements Subsystem{

    private State currentState = State.IDLE;

    private double speed = 0;

    private TalonFX shootMotor; //TODO: Initialize the motor

    public enum State {
        SHOOTING,
        IDLE
    }

    @Override
    public void processLoop(double timestamp) {
    switch (currentState) {
        case SHOOTING:
            break;
        case IDLE:
        default:
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
        currentState = state;
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
