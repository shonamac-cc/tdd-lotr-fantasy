import org.junit.Before;
import org.junit.Test;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;

    @Before
    public void before(){
        axe = new Axe();
    }

    @Test
    public void hasDamagePoints(){
        assertEquals(10, axe.attack());
    }

    @Test
    public void hasName(){
        assertEquals("Gimli's axe", axe.getName());
    }

    @Test
    public void hasSound(){
        assertEquals("Chop", axe.getSound());
    }
}
