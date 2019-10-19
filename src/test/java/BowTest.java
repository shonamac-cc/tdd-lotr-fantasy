import org.junit.Before;
import org.junit.Test;
import weapons.Bow;

import static org.junit.Assert.assertEquals;

public class BowTest {

    Bow bow;

    @Before
    public void before(){
        bow = new Bow();
    }

    @Test
    public void hasDamagePoints(){
        assertEquals(20, bow.attack());
    }

    @Test
    public void hasName(){
        assertEquals("Galadhrim", bow.getName());
    }

    @Test
    public void hasSound(){
        assertEquals("Twang", bow.getSound());
    }
}
