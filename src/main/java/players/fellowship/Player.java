package players.fellowship;

import behaviours.IWeapon;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int hPoints;
    private ArrayList<IWeapon> weapons;

    public Player(String name, int hPoints, ArrayList<IWeapon> weapons){
        this.name = name;
        this.hPoints = hPoints;
        this.weapons = weapons;
    }

//    every player is going to have a weapon or weapons
    public ArrayList<IWeapon> getWeapons(){
        return weapons;
    }

//    create abstract method to add weapons so each child inherits
    public abstract void addWeapons();
}
