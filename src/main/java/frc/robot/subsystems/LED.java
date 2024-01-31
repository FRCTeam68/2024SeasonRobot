package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.util.Color;

public class LED implements Subsystem{

    private AddressableLED stripL;
    private AddressableLED stripR;

    private AddressableLEDBuffer bufferL;
    private AddressableLEDBuffer bufferR;

    public LED() {
        stripL = new AddressableLED(0); //TODO: change port
        stripR = new AddressableLED(0); //TODO: change port
        bufferL = new AddressableLEDBuffer(0); //TODO: change length
        bufferR = new AddressableLEDBuffer(0); //TODO: change length

        stripL.setLength(bufferL.getLength());
        stripR.setLength(bufferR.getLength());

        stripL.setData(bufferL);
        stripR.setData(bufferR);

        stripL.start();
        stripR.start();
    }

    @Override
    public void processLoop(double timestamp) {
        
    }

    @Override
    public void stop() {
        stripL.stop();
        stripR.stop();
    }


    /**
     * Try to call only once when you change. Maybe create a toggle?
     * @param color
     */
    public void setLeftColor(Color color) {
        for (int i = 0; i < bufferL.getLength(); i++) {
            bufferL.setLED(i, color);
        }

        stripL.setData(bufferL);
    }

    /**
     * Try to call only once when you change. Maybe create a toggle?
     * @param color
     */
    public void setRightColor(Color color) {
        for (int i = 0; i < bufferR.getLength(); i++) {
            bufferR.setLED(i, color);
        }

        stripR.setData(bufferR);
    }

    public void setLeftLED(int index, Color color) {
        bufferL.setLED(index, color);
    }

    public void setRightLED(int index, Color color) {
        bufferR.setLED(index, color);
    }

    public void updateLeftLED(){
        stripL.setData(bufferL);
    }

    public void updateRightLED(){
        stripR.setData(bufferR);
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
        return "LED";
    }
    
}
