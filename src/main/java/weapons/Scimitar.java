package weapons;

import behaviours.IWeapon;

public class Scimitar implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Scimitar(){
        this.damagePoints = 3;
        this.name = "Scimitar";
        this.sound = "Clang";
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
