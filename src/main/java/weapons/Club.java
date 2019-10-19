package weapons;

import behaviours.IWeapon;

public class Club extends Weapon implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Club(){
        super(8, "Club", "Whack");
    }

}
