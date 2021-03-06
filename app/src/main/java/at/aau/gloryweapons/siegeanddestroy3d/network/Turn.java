package at.aau.gloryweapons.siegeanddestroy3d.network;

import at.aau.gloryweapons.siegeanddestroy3d.game.models.User;

public class Turn {

    private TurnType type;
    private User user;
    private int attacksUserID;
    private int yCoordinates;
    private int xCoordinates;

    public enum TurnType{
        SHOT,
        POWERUP,
        HIT,
        NO_HIT,
        ERROR
    }

    public Turn(TurnType type, User user){
        this.type = type;
        this.user = user;
    }

    public TurnType getType() {
        return type;
    }

    public void setType(TurnType type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public int getAttacksUserID() {
        return attacksUserID;
    }

    public void setAttacksUserID(int attacksUserID) {
        this.attacksUserID = attacksUserID;
    }

    public int getyCoordinates() {
        return yCoordinates;
    }

    public void setyCoordinates(int yCoordinates) {
        this.yCoordinates = yCoordinates;
    }

    public int getxCoordinates() {
        return xCoordinates;
    }

    public void setxCoordinates(int xCoordinates) {
        this.xCoordinates = xCoordinates;
    }
}

