import org.junit.Before;
import org.junit.Test;
import weapons.Spear;

import static org.junit.Assert.assertEquals;

public class SpearTest {

    Spear spear;

    @Before
    public void before(){
        spear = new Spear();
    }

    @Test
    public void hasDamagePoints(){
        assertEquals(11, spear.attackPoints());
    }

    @Test
    public void hasName(){
        assertEquals("Spear", spear.getName());
    }

    @Test
    public void hasSound(){
        assertEquals("Hong", spear.getSound());
    }
}
