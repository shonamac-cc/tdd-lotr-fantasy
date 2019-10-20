import behaviours.IEnemy;
import behaviours.IFellowship;
import players.enemies.Orc;
import players.fellowship.Hobbit;

public class Runner {

    public static void main(String[] args){
        IFellowship hobbit = new Hobbit();
        IEnemy orc = new Orc();
        Game game = new Game(orc, hobbit);

        System.out.println(game.startGame());

        System.out.println(game.fellowshipAttackEnemy());
        System.out.println(game.enemyAttackFellowship());

    }
}
