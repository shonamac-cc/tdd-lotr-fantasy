package weapons;

import behaviours.IWeapon;

public class Staff extends Weapon implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Staff(){
        super(10, "Gandalf's staff", "Magic");
    }
}
