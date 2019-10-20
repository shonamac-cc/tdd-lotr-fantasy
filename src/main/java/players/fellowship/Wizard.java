package players.fellowship;

import behaviours.IFellowship;
import behaviours.IWeapon;
import weapons.Staff;

import java.util.ArrayList;

public class Wizard extends Player implements IFellowship {

    private Staff staff = new Staff();
    public Wizard() {
        super("Gandalf", 100, new ArrayList<IWeapon>());
    }

    public void addWeapons() {
        getWeapons().add(staff);
    }
}
