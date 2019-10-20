package behaviours;

public interface IEnemy {

    void takeDamage(int damagePoints);
    String attack(IFellowship fellowship);
    int getHPoints();
    String getName();
}
