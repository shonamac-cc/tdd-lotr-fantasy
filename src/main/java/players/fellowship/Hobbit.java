package players.fellowship;


import behaviours.IWeapon;
import weapons.Sword;
import weapons.Weapon;

import java.util.ArrayList;

public class Hobbit extends Player{

    private Sword sword = new Sword();

//    decided to hardcode here rather than set in test as want to have a fight method which can be used in runner
    public Hobbit() {
        super("Frodo", 100, new ArrayList<IWeapon>());
    }

    public void addWeapons(){
        getWeapons().add(sword);
    }

    public int damage(Weapon weapon){
        setHPoints(getHPoints() - weapon.attack());
        return getHPoints();
    }
}
