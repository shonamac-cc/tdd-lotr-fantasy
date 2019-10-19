package weapons;

import behaviours.IWeapon;

public class Spear extends Weapon implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Spear(){
        super(11, "Spear", "Hong");
    }


}
