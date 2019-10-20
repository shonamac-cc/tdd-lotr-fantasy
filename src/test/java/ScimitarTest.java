import org.junit.Before;
import org.junit.Test;
import weapons.Scimitar;

import static org.junit.Assert.assertEquals;

public class ScimitarTest {

    Scimitar scimitar;

    @Before
    public void before(){
        scimitar = new Scimitar();
    }

    @Test
    public void hasDamagePoints(){
        assertEquals(3, scimitar.attackPoints());
    }

    @Test
    public void hasName(){
        assertEquals("Scimitar", scimitar.getName());
    }

    @Test
    public void hasSound(){
        assertEquals("Clang", scimitar.getSound());
    }
}
