package Drone.DroneCommands;

import Drone.Hardware.ATReciever;
import Drone.Helpers.IntToFloat;

import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Sends the "move-up" command. to create a new command copy'n'paste this code
 * into a new command class, and change names and the AT_COMMAND_STRING's
 *
 * @author orpheus
 */
public class Cmnd_MoveUp implements ATCommand {

    /**
     * command string part 1
     **/
    private static final String AT_COMMAND_STRING1 = "AT*PCMD=";
    /**
     * command string part 2
     **/
    private static final String AT_COMMAND_STRING2 = ",1,0,0,";
    /**
     * command string part 2
     **/
    private static final String AT_COMMAND_STRING3 = ",0";
    /**
     * speed constant
     **/
    private static final float SPEED = 1.0f;
    /**
     * reference to the reciever
     **/
    private ATReciever motors;

    /**
     * Default CTOR, initialise stuff
     */
    public Cmnd_MoveUp(InetAddress ipAddress, DatagramSocket socket) {
        motors = new ATReciever(ipAddress, socket);
    }

    /**
     * send the command created by concatonating AT_COMMAND_STRING1, the sequence
     * parameter and AT_COMMAND_STRING2 to the ATReciever
     */
    @Override
    public void execute(int sequence) throws Exception {
        motors.send_at_cmd(AT_COMMAND_STRING1 + sequence + AT_COMMAND_STRING2
                + IntToFloat.input(SPEED) + AT_COMMAND_STRING3);
    }

}