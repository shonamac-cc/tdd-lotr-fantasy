package weapons;

import behaviours.IWeapon;

public class Sword extends Weapon implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Sword(){
        super(15, "Sting", "Schwing");
    }


}
