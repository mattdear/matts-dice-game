package mdg;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  Developer: Matthew Dear
 *  GitHub: http://www.github.com/mattdear
 */

public class DiceTest {
    
    /**
     * Test of constructor method, of class Dice.
     */
    @Test
    public void testConstruct() {
        System.out.println("Start diceTestConstruct");
        Dice instance = null;
        int expResult = 1;
        instance = new Dice(expResult);
        assertNotNull(instance);
        assertEquals(expResult, instance.getValue());
    }

    /**
     * Test of getValue method, of class Dice.
     */
    @Test
    public void testGetValue() {
        System.out.println("Start diceTestGetValue");      
        Dice instance = null;
        int expResult = 2;
        instance = new Dice(expResult);
        assertNotNull(instance);
        assertEquals(expResult, instance.getValue());
    }

    /**
     * Test of setValue method, of class Dice.
     */
    @Test
    public void testSetValue() {
        System.out.println("Start diceTestSetValue");
        Dice instance = null;
        int initialValue = 1;
        int expResult = 3;
        instance = new Dice(initialValue);
        assertNotNull(instance);
        assertEquals(initialValue, instance.getValue());
        instance.setValue(expResult);
        assertEquals(expResult, instance.getValue());
    }
}
