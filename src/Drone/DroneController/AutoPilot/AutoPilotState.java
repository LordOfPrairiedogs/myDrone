package Drone.DroneController.AutoPilot;

/**
 * template for autopilot states
 *
 * @author orpheus
 */
public interface AutoPilotState {
    /**
     * perform appropriate XYZ adjustement
     *
     * @throws Exception
     */
    void adjustAction(AutoPilot autopilot);

    /**
     * get a string label belonging to the state
     *
     * @return string containing the state label
     */
    String toString();

}
