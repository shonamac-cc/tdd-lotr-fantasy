package weapons;

import behaviours.IWeapon;

public class Bow implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Bow(){
        this.damagePoints = 20;
        this.name = "Galadhrim";
        this.sound = "Twang";
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
