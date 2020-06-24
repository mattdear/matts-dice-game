package mdg;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  Developer: Matthew Dear
 *  GitHub: http://www.github.com/mattdear
 */

public class DiceTest {
      
    @Test
    public void testConstruct() {
        int expResult = 1;
        System.out.println("Start diceTestConstruct");
        Dice instance = null;
        assertNull(instance);
        instance = new Dice(expResult);
        assertNotNull(instance);
        assertEquals(expResult, instance.getValue());
    }

    @Test
    public void testGetValue() {
        int expResult = 2;
        System.out.println("Start diceTestGetValue");      
        Dice instance = new Dice(expResult);
        assertNotNull(instance);
        assertEquals(expResult, instance.getValue());
    }

    @Test
    public void testSetValue() {
        int expResult = 3;
        System.out.println("Start diceTestSetValue");
        Dice instance = new Dice(1);
        assertNotNull(instance);
        assertEquals(1, instance.getValue());
        instance.setValue(expResult);
        assertEquals(expResult, instance.getValue());
    }
}
