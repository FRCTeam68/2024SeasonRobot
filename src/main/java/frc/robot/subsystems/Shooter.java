package frc.robot.subsystems;

public class Shooter implements Subsystem {
    private State currentState = State.IDLE;

    private float speed = 0; 

    public enum State {
        IDLE,
        SHOOT
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

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
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
