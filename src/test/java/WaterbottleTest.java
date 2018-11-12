import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTest {

    Waterbottle bottle;

    @Before
    public void before(){
        bottle = new Waterbottle(100);
    }

    @Test
    public void canDrink(){
        assertEquals(90, bottle.drink());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, bottle.empty());
    }

    @Test
    public void canFill(){
        assertEquals(100, bottle.fill());
    }
}
