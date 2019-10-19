package weapons;

import behaviours.IWeapon;

public class Axe implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Axe(){
        this.damagePoints = 10;
        this.name = "Gimli's axe";
        this.sound = "chop";
    }

    public String attack() {
        return "I attack with an Axe ";
    }
}
