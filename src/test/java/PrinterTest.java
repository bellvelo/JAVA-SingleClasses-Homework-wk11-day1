import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer1;

    @Before
    public void before(){
        printer1 = new Printer(200, 200);
    }

    @Test
    public void paperCheck(){
        printer1.canPrint(5,5);
        assertEquals(175, printer1.getSheetCount());
    }

    @Test
    public void tonerCheck(){
        printer1.canPrint(10,10);
        assertEquals(100, printer1.getTonerLevel());
    }

    @Test
    public void canPrint(){
        assertEquals('Y', printer1.canPrint(5,5));
    }

    @Test
    public void cantPrint(){
        assertEquals('N', printer1.canPrint(50,5));
    }

    @Test
    public void refillPaper(){
        assertEquals(210, printer1.refillPaper(10));
    }

    @Test
    public void tooMuchPaper(){
        assertEquals(200, printer1.refillPaper(150));
    }

}



