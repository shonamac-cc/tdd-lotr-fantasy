package weapons;

import behaviours.IWeapon;

public class Club implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Club(){
        this.damagePoints = 8;
        this.name = "Club";
        this.sound = "Whack";
    }

    public int attack() {
        return this.damagePoints;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }
}
