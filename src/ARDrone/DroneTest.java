package ARDrone;

import ARDrone.Drone.ArDrone2;
import ARDrone.Utility.ManualControl;

import java.net.UnknownHostException;

/**
 * Created by dar on 1/10/16.
 */
public class DroneTest {
    public static void main(String[] args) {
        //TODO: need to figure out initialization
        ArDrone2 primaryDrone = null;
        try
        {
            primaryDrone = new ArDrone2 ("192.168.1.1");
        }
        catch (UnknownHostException e)
        {
            e.printStackTrace ();
        }



    }
}
