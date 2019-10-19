package players.fellowship;

public abstract class Player {

    private String name;
    private int hPoints;

    public Player(String name, int hPoints){
        this.name = name;
        this.hPoints = hPoints;
    }
}
