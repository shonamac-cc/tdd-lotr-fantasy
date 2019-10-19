package players.fellowship;

import behaviours.IWeapon;

import java.util.ArrayList;

public class Dwarf extends Player implements IWeapon {
    public Dwarf() {
        super("Gimli", 100, new ArrayList<IWeapon>());
    }

    public int attack() {
        return 0;
    }

    public void addWeapons() {

    }
}
