package weapons;

import behaviours.IWeapon;

public class Bow extends Weapon implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Bow(){
        super(20, "Galadhrim", "Twang");
    }


}
