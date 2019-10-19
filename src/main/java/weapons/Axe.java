package weapons;

import behaviours.IWeapon;

public class Axe implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Axe(){
        this.damagePoints = 10;
        this.name = "Gimli's axe";
        this.sound = "Chop";
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
