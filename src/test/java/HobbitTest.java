import org.junit.Before;
import org.junit.Test;
import players.fellowship.Hobbit;

import static org.junit.Assert.assertEquals;

public class HobbitTest {

    Hobbit hobbit;

    @Before
    public void before(){
        hobbit = new Hobbit();
    }

    @Test
    public void hasWeapons(){
        hobbit.addWeapons();
        assertEquals(1, hobbit.getWeapons().size());
    }
}
