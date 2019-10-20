package players.fellowship;

import behaviours.IFellowship;
import behaviours.IWeapon;
import weapons.Axe;
import weapons.Weapon;

import java.util.ArrayList;

public class Dwarf extends Player implements IFellowship {

    private Axe axe = new Axe();
    public Dwarf() {
        super("Gimli", 100, new ArrayList<IWeapon>());
    }

    public void addWeapons() {
        getWeapons().add(axe);
    }


}
