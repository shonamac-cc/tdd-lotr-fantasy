package weapons;

import behaviours.IWeapon;

public class Club implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Sword(){
        this.damagePoints = 8;
        this.name = "Club";
        this.sound = "Whack";
    }

    public int attack() {
        return this.damagePoints;
    }
}
