package players.fellowship;

import behaviours.IWeapon;

public class Dwarf extends Player implements IWeapon {
    public Dwarf(String name, int hPoints) {
        super(name, hPoints);
    }

    public int attack() {
        return 0;
    }
}
