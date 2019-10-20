import behaviours.IEnemy;
import behaviours.IFellowship;

public class Game {

    private IEnemy enemy;
    private IFellowship fellowship;

    public Game(IEnemy enemy, IFellowship fellowship){
        this.enemy = enemy;
        this.fellowship = fellowship;
    }

    public String startGame(){
        return fellowship.getName() + " met " + enemy.getName() + " they will fight...";
    }

    public String fellowshipAttackEnemy(){
        if (enemy.getHPoints() > 0 && fellowship.getHPoints() > 0) {
            return fellowship.attack(enemy);
        } else if (fellowship.getHPoints() > 0 && enemy.getHPoints() <= 0){
            return fellowship.getName() + " Wins , WOOOP WOOOOP" ;
        } else {
            return "";
        }
    }

    public String enemyAttackFellowship(){

        if (fellowship.getHPoints() > 0 && enemy.getHPoints() > 0) {
            return enemy.attack(fellowship);
        } else if (enemy.getHPoints() > 0 && fellowship.getHPoints() <= 0){
            return enemy.getName() + " wins , boooo";
        } else {
            return "";
        }


    }
}
