import org.junit.Before;
import org.junit.Test;
import players.enemies.Orc;
import players.fellowship.Hobbit;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class HobbitTest {

    Hobbit hobbit;
    Orc orc;
    Sword sword;

    @Before
    public void before(){
        hobbit = new Hobbit();
        orc = new Orc();
        sword = new Sword();
    }

    @Test
    public void hasWeapons(){
        hobbit.addWeapons();
        assertEquals(1, hobbit.getWeapons().size());
    }

    @Test
    public void canDamageEnemy(){
        orc.damage(sword);
        assertEquals(85, orc.getHPoints());
    }

}
