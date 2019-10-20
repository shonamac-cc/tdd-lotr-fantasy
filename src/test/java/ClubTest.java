import org.junit.Before;
import org.junit.Test;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    Club club;

    @Before
    public void before(){
        club = new Club();
    }

    @Test
    public void hasDamagePoints(){
        assertEquals(8, club.attackPoints());
    }

    @Test
    public void hasName(){
        assertEquals("Club", club.getName());
    }

    @Test
    public void hasSound(){
        assertEquals("Whack", club.getSound());
    }
}
