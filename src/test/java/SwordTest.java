import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before(){
        sword = new Sword();
    }

    @Test
    public void hasDamagePoints(){
        assertEquals(15, sword.attackPoints());
    }

    @Test
    public void hasName(){
        assertEquals("Sting", sword.getName());
    }

    @Test
    public void hasSound(){
        assertEquals("Schwing", sword.getSound());
    }
}
