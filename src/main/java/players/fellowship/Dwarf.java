package players.fellowship;

import behaviours.IWeapon;
import weapons.Weapon;

import java.util.ArrayList;

public class Dwarf extends Player{
    public Dwarf() {
        super("Gimli", 100, new ArrayList<IWeapon>());
    }

    public void addWeapons() {

    }

    public int damage(Weapon weapon){
        setHPoints(getHPoints() - weapon.attackPoints());
        return getHPoints();
    }
}
