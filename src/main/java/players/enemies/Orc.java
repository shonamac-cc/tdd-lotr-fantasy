package players.enemies;

import behaviours.IWeapon;
import weapons.Club;
import weapons.Weapon;

import java.util.ArrayList;

public class Orc extends Enemy {

    private Club club = new Club();

    public Orc() {
        super("Azog", 100, new ArrayList<IWeapon>());
    }

    public void addWeapons() {
        getWeapons().add(club);
    }

    public int damage(Weapon weapon) {
        setHPoints(getHPoints() - weapon.attack());
        return getHPoints();
    }
}
