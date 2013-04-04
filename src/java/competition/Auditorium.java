package competition;

/**
 *
 * @author the-ramones
 */
public class Auditorium {
    
    public static enum State {
        
        ON,
        OFF,
    }
    private State light = State.OFF;
    
    public Auditorium() {
    }
    
    public State getLight() {
        return light;
    }
    
    public void setLight(State light) {
        this.light = light;
    }
    
    public void turnOnTheLights() {
        setLight(State.ON);
    }
    
    public void turnOffTheLights() {
        setLight(State.OFF);
    }
    
    public void lightsState() {
        if (light == State.ON) {
            System.out.println("LIGHTS: ON");            
        } else {
            System.out.println("LIGHTS: OFF");
        }
    }
}
