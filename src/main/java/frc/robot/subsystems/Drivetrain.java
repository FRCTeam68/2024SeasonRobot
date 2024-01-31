package frc.robot.subsystems;

public class Drivetrain implements Subsystem{

    private State currentState = State.IDLE;

    public enum State {
        IDLE
    }

    @Override
    public void processLoop(double timestamp) {
    
    }

    @Override
    public void stop() {
        
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
        return "Drivetrain";
    }
    
}
