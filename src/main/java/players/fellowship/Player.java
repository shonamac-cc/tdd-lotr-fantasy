package players.fellowship;

import behaviours.IEnemy;
import behaviours.IWeapon;

import java.util.ArrayList;
import java.util.Random;

public abstract class Player {

    private String name;
    private int hPoints;
    private ArrayList<IWeapon> weapons;

    public Player(String name, int hPoints, ArrayList<IWeapon> weapons){
        this.name = name;
        this.hPoints = hPoints;
        this.weapons = weapons;
    }

    public String getName() {
        return name;
    }

    public int getHPoints() {
        return hPoints > 0 ? hPoints : 0;
    }

    public void setHPoints(int newHPoints) {
        this.hPoints = newHPoints;
    }

    public void takeDamage(int damagePoints) {
        int newHPoints =  getHPoints() - damagePoints;
        setHPoints(newHPoints);
    }

    //    every player is going to have a weapon or weapons
    public ArrayList<IWeapon> getWeapons(){
        return weapons;
    }

//    create abstract method to add weapons so each child inherits
    public abstract void addWeapons();

    public String attack(IEnemy enemy){
        addWeapons();
        Random random = new Random();
        IWeapon attackingWeapon = this.weapons.get(random.nextInt(weapons.size()));
        int damagePoints = attackingWeapon.attackPoints();
        enemy.takeDamage(damagePoints);
        String attackMsg = attackingWeapon.getSound() + ", " + getName() + " has Attacked " + enemy.getName() + " with " + attackingWeapon.getName              () + ". " + enemy.getName() + " lost " +
                attackingWeapon.attackPoints() + " health points, " + enemy.getName() + "'s remaining health points is " + enemy.getHPoints();
        return attackMsg;
    }


}

