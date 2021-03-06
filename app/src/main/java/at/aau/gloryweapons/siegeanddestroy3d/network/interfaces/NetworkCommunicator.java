package at.aau.gloryweapons.siegeanddestroy3d.network.interfaces;


import java.util.List;

import at.aau.gloryweapons.siegeanddestroy3d.game.models.BasicShip;
import at.aau.gloryweapons.siegeanddestroy3d.game.models.BattleArea;
import at.aau.gloryweapons.siegeanddestroy3d.game.models.GameConfiguration;
import at.aau.gloryweapons.siegeanddestroy3d.game.models.GameSettings;
import at.aau.gloryweapons.siegeanddestroy3d.game.models.User;
import at.aau.gloryweapons.siegeanddestroy3d.network.Instruction;

/**
 * The Interface for a Object used to communicate with the server.
 */
public interface NetworkCommunicator {
    /**
     * Sends a name to the server asynchronously and responds with the complete User if the name is valid.
     *
     * @param name     The name to use for the user.
     * @param callback The callback which is called to return the User object. Null, if the name is not valid in the context.
     */
    public void sendNameToServer(String name, CallbackObject<User> callback);

    /**
     * Sends the whole game configuration for a user to the server asynchronously. The server responds with the complete configuration for the game.
     *
     * @param user        The user for whom the configuration is created.
     * @param userBoard   The board of the user, with all placed ships.
     * @param placedShips The ships of the user.
     * @param callback    The callback which is called to return the configurations of all users, as soon as everyone finished.
     */
    public void sendGameConfigurationToServer(User user, BattleArea userBoard,
                                              List<BasicShip> placedShips, CallbackObject<GameConfiguration> callback);

    /**
     * Registers a callback which is called if the communicator receives a message from the server.
     *
     * @param callback
     */
    public void receiveServerMessages(CallbackObject<Instruction> callback);

}
