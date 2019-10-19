package players.enemies;

public abstract class Enemy {

    private String name;
    private int hPoints;

    public Enemy(String name, int hPoints){
        this.name = name;
        this.hPoints = hPoints;
    }
}
