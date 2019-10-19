package weapons;

import behaviours.IWeapon;

public class Spear implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Spear(){
        this.damagePoints = 11;
        this.name = "Spear";
        this.sound = "Hong";
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
