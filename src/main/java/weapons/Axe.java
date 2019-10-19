package weapons;

import behaviours.IWeapon;

public class Axe extends Weapon implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Axe(){
        super(10, "Gimli's axe", "Chop");
    }


}
