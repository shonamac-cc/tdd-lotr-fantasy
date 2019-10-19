package players.enemies;

import behaviours.IWeapon;

import java.util.ArrayList;

public abstract class Enemy {

    private String name;
    private int hPoints;
    private ArrayList<IWeapon> weapons;

    public Enemy(String name, int hPoints, ArrayList<IWeapon> weapons){
        this.name = name;
        this.hPoints = hPoints;
        this.weapons = weapons;
    }

    public String getName() {
        return name;
    }

    public int getHPoints() {
        return hPoints;
    }

    public void setHPoints(int hPoints) {
        this.hPoints = hPoints;
    }

//    every enemy is going to have a weapon or weapons
    public ArrayList<IWeapon> getWeapons() {
        return weapons;
    }

    //    create abstract method to add weapons so each child inherits
    public abstract void addWeapons();
}
