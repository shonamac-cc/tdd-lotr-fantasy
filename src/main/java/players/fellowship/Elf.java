package players.fellowship;

import behaviours.IFellowship;
import behaviours.IWeapon;
import weapons.Bow;


import java.util.ArrayList;

public class Elf extends Player implements IFellowship {

    private Bow bow = new Bow();

    public Elf() {
        super("Legolas", 100, new ArrayList<IWeapon>());
    }

    public void addWeapons() {
        getWeapons().add(bow);
    }


}
