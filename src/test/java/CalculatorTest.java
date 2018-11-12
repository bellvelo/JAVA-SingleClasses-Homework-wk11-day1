import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(10, calc.addition(5,5));
    }
    @Test
    public void canSubtract(){
        assertEquals(0, calc.subtract(5,5));
    }
    @Test
    public void canDivide(){
        assertEquals(1, calc.divide(5,5));
    }
    @Test
    public void canMultiply(){
        assertEquals(25, calc.multiply(5,5));
    }
}
