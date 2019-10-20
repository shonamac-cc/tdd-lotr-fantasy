import org.junit.Before;
import org.junit.Test;
import players.enemies.Orc;
import players.fellowship.Hobbit;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;
    Club club;
    Hobbit hobbit;

    @Before
    public void before(){
        orc = new Orc();
        club = new Club();
        hobbit = new Hobbit();
    }

    @Test
    public void canDamageFellowship(){
        hobbit.takeDamage(8);
        assertEquals(92, hobbit.getHPoints());
    }


}
