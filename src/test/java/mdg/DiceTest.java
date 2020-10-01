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
    
    /**
     * Test of getHold method, of class Dice.
     */
    @Test
    public void testGetHold() {
        System.out.println("Start diceTestGetHold");      
        Dice instance = null;
        boolean expResult = false;
        instance = new Dice(0);
        assertNotNull(instance);
        assertEquals(expResult, instance.getHold());
    }

    /**
     * Test of setHold method, of class Dice.
     */
    @Test
    public void testSetHold() {
        System.out.println("Start diceTestSetHold");
        Dice instance = null;
        boolean initialHold = false;
        boolean expResult = true;
        instance = new Dice(0);
        assertNotNull(instance);
        assertEquals(initialHold, instance.getHold());
        instance.setHold(expResult);
        assertEquals(expResult, instance.getHold());
    }
    
    /**
     * Test of roll method, of class Dice.
     */
    @Test
    public void testRoll() {
        System.out.println("Start diceTestRoll");
        Dice instance = null;
        int initialValue = 0;
        instance = new Dice(initialValue);
        assertNotNull(instance);
        assertEquals(initialValue, instance.getValue());
        instance.roll();
        System.out.println("diceTestRoll new value = " + instance.getValue());
        assertNotNull(instance.getValue());
    }
}
