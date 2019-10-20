package weapons;

import behaviours.IWeapon;

public class Weapon implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Weapon(int damagePoints, String name, String sound){
        this.damagePoints = damagePoints;
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public int attackPoints() {
        return this.damagePoints;
    }
}
