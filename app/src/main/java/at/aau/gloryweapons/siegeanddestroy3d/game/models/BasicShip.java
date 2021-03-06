package at.aau.gloryweapons.siegeanddestroy3d.game.models;

/**
 * Created by Alexander on 05.04.2018.
 */

public class BasicShip {
    private int userId = -1;
    private int length = 0;
    private BattleAreaTile[] tiles;
    private boolean horizontal = true;

    public BasicShip(int userId, int length, boolean horizontal) {
        this.userId = userId;
        this.length = length;
        this.tiles = new BattleAreaTile[this.length];
        this.horizontal = horizontal;
    }

    public int getUserId() {
        return userId;
    }

    public int getLength() {
        return length;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }

    /**
     * Toggles the orientation from horizontal to vertical and vice versa.
     */
    public void toggleOrientation(){
        this.horizontal = !this.horizontal;
    }

    public BattleAreaTile[] getTiles() {
        return tiles;
    }
}
