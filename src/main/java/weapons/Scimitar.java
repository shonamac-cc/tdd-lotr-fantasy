package weapons;

import behaviours.IWeapon;

public class Scimitar extends Weapon implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Scimitar(){
        super(3, "Scimitar", "Clang");
    }

}
