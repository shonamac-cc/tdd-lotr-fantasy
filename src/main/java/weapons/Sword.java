package weapons;

import behaviours.IWeapon;

public class Sword implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Sword(){
        this.damagePoints = 15;
        this.name = "Sting";
        this.sound = "schwing";
    }
    public String attack() {
        return "I attack with a sword ";
    }
}
