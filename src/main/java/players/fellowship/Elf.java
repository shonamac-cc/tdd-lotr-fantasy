package players.fellowship;

import behaviours.IWeapon;

public class Elf extends Player implements IWeapon {
    public Elf(String name, int hPoints) {
        super(name, hPoints);
    }

    public int attack() {
        return 0;
    }
}
