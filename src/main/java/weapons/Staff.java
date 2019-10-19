package weapons;

import behaviours.IWeapon;

public class Staff implements IWeapon {

    private int damagePoints;

    public int attack() {
        return this.damagePoints;
    }
}
