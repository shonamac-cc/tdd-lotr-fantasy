package players.fellowship;

import behaviours.IWeapon;
import weapons.Weapon;

import java.util.ArrayList;

public class Elf extends Player{
    public Elf() {
        super("Legolas", 100, new ArrayList<IWeapon>());
    }

    public void addWeapons() {

    }

    public int damage(Weapon weapon){
        setHPoints(getHPoints() - weapon.attackPoints());
        return getHPoints();
    }
}
