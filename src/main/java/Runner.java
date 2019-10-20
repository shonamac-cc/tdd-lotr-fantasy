import behaviours.IEnemy;
import behaviours.IFellowship;
import players.enemies.Orc;
import players.enemies.Troll;
import players.fellowship.Dwarf;
import players.fellowship.Elf;
import players.fellowship.Hobbit;
import players.fellowship.Wizard;

public class Runner {

    public static void main(String[] args){
        IFellowship hobbit = new Hobbit();
        IFellowship elf = new Elf();
        IFellowship dwarf = new Dwarf();
        IFellowship wizard = new Wizard();
        IEnemy orc = new Orc();
        IEnemy troll = new Troll();
        Game game = new Game(orc, hobbit);
        Game game2 = new Game(troll, dwarf);
        Game game3 = new Game(troll, elf);
        Game game4 = new Game(orc, wizard);

        System.out.println(game.startGame());
        System.out.println(game2.startGame());
        System.out.println(game3.startGame());
        System.out.println(game4.startGame());

        System.out.println(game.fellowshipAttackEnemy());
        System.out.println(game.enemyAttackFellowship());

        System.out.println(game2.fellowshipAttackEnemy());
        System.out.println(game2.enemyAttackFellowship());

        System.out.println(game3.fellowshipAttackEnemy());
        System.out.println(game3.enemyAttackFellowship());

        System.out.println(game4.fellowshipAttackEnemy());
        System.out.println(game4.enemyAttackFellowship());

    }
}
