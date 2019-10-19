package players.fellowship;

import behaviours.IWeapon;
import weapons.Weapon;

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

    public int damage(Weapon weapon){
        setHPoints(getHPoints() - weapon.attack());
        return getHPoints();
    }
}
