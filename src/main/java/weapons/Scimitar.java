package weapons;

import behaviours.IWeapon;

public class Scimitar implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Sword(){
        this.damagePoints = 3;
        this.name = "Scimitar";
        this.sound = "Clang";
    }

    public int attack() {
        return this.damagePoints;
    }
}
