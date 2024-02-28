package adapter.ducks.challenge;

import adapter.ducks.Duck;

/**
 * @author lh
 */
public class DroneAdapter implements Duck {
    public DroneAdapter(Drone drone) {
        this.drone = drone;
    }

    private Drone drone;
    @Override
    public void quack() {
        drone.beep();
    }

    @Override
    public void fly() {
        drone.spin_rotors();
        drone.take_off();
    }
}
