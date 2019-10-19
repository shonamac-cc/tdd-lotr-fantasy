package weapons;

import behaviours.IWeapon;

public class Sword implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Sword(){
        this.damagePoints = 15;
        this.name = "Sting";
        this.sound = "Schwing";
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
