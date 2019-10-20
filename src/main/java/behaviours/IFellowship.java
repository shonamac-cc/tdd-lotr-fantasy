package behaviours;

public interface IFellowship {

    void takeDamage(int damagePoints);
    String attack(IEnemy enemy);
    String getName();
    int getHPoints();
}
