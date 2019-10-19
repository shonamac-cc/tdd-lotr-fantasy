package weapons;

import behaviours.IWeapon;

public class Bow implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Bow(){
        this.damagePoints = 20;
        this.name = "Galadhrim";
        this.sound = "twang";
    }
    public String attack() {
        return "I attack with a bow ";
    }
}
