package frc.robot.subsystems;

public class Shooter implements Subsystem {
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

    /**
     * Put logic here on what states lock what states.
     * @param state
     */
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
        return "Shooter";
    }
    
}
