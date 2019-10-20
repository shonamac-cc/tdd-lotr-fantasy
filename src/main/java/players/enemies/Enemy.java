package players.enemies;

import behaviours.IEnemy;
import behaviours.IFellowship;
import behaviours.IWeapon;

import java.util.ArrayList;

public abstract class Enemy implements IEnemy {

    private String name;
    private int hPoints;
    private IWeapon weapon;

    public Enemy(String name, int hPoints, IWeapon weapon){
        this.name = name;
        this.hPoints = hPoints;
        this.weapon = weapon;
    }

    public void takeDamage(int damagePoints) {
        int newHPoints =  getHPoints() - damagePoints;
        setHPoints(newHPoints);
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

    public String attack(IFellowship fellowship){
        int damagePoints = this.weapon.attackPoints();
        fellowship.takeDamage(damagePoints);
        String attackMsg = weapon.getSound() + ", " + getName() + " has Attacked " + fellowship.getName() + " with " + weapon.getName() +
                ". " + fellowship.getName() + " lost " +
                weapon.attackPoints() + " health points, " + fellowship.getName() + "'s remaining health points is " + fellowship.getHPoints();
        return attackMsg;
    }


}
