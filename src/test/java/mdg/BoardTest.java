package mdg;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Developer: Matthew Dear GitHub: http://www.github.com/mattdear
 */
public class BoardTest {

    public BoardTest() {
    }

    /**
     * Test of constructor method, of class Scorecard.
     */
    public void testConstruct() {
        System.out.println("construct");
        Board instance = new Board();
        assertNotNull(instance);
    }

    /**
     * Test of getActiveOnes method, of class Board.
     */
    @Test
    public void testGetActiveOnes() {
        System.out.println("getActiveOnes");
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getActiveOnes();
        assertEquals(expResult, result);
    }

    /**
     * Test of setActiveOnes method, of class Board.
     */
    @Test
    public void testSetActiveOnes() {
        System.out.println("setActiveOnes");
        int activeOnes = 1;
        Board instance = new Board();
        instance.setActiveOnes(activeOnes);
        assertEquals(activeOnes, instance.getActiveOnes());
    }

    /**
     * Test of getActiveTwos method, of class Board.
     */
    @Test
    public void testGetActiveTwos() {
        System.out.println("getActiveTwos");
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getActiveTwos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setActiveTwos method, of class Board.
     */
    @Test
    public void testSetActiveTwos() {
        System.out.println("setActiveTwos");
        int activeTwos = 2;
        Board instance = new Board();
        instance.setActiveTwos(activeTwos);
        assertEquals(activeTwos, instance.getActiveTwos());
    }

    /**
     * Test of getActiveThrees method, of class Board.
     */
    @Test
    public void testGetActiveThrees() {
        System.out.println("getActiveThrees");
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getActiveThrees();
        assertEquals(expResult, result);
    }

    /**
     * Test of setActiveThrees method, of class Board.
     */
    @Test
    public void testSetActiveThrees() {
        System.out.println("setActiveThrees");
        int activeThrees = 3;
        Board instance = new Board();
        instance.setActiveThrees(activeThrees);
        assertEquals(activeThrees, instance.getActiveThrees());
    }

    /**
     * Test of getActiveFours method, of class Board.
     */
    @Test
    public void testGetActiveFours() {
        System.out.println("getActiveFours");
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getActiveFours();
        assertEquals(expResult, result);
    }

    /**
     * Test of setActiveFours method, of class Board.
     */
    @Test
    public void testSetActiveFours() {
        System.out.println("setActiveFours");
        int activeFours = 4;
        Board instance = new Board();
        instance.setActiveFours(activeFours);
        assertEquals(activeFours, instance.getActiveFours());
    }

    /**
     * Test of getActiveFives method, of class Board.
     */
    @Test
    public void testGetActiveFives() {
        System.out.println("getActiveFives");
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getActiveFives();
        assertEquals(expResult, result);
    }

    /**
     * Test of setActiveFives method, of class Board.
     */
    @Test
    public void testSetActiveFives() {
        System.out.println("setActiveFives");
        int activeFives = 5;
        Board instance = new Board();
        instance.setActiveFives(activeFives);
        assertEquals(activeFives, instance.getActiveFives());
    }

    /**
     * Test of getActiveSixes method, of class Board.
     */
    @Test
    public void testGetActiveSixes() {
        System.out.println("getActiveSixes");
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getActiveSixes();
        assertEquals(expResult, result);
    }

    /**
     * Test of setActiveSixes method, of class Board.
     */
    @Test
    public void testSetActiveSixes() {
        System.out.println("setActiveSixes");
        int activeSixes = 6;
        Board instance = new Board();
        instance.setActiveSixes(activeSixes);
        assertEquals(activeSixes, instance.getActiveSixes());
    }

    /**
     * Test of diceValues method, of class Board.
     */
    @Test
    public void testDiceValues() {
        System.out.println("diceValues");
        int diceTotal = 0;
        String diceCard = "\n| Roll --------------------------|\n"
                + "| Dice  | 1  | 2  | 3  | 4  | 5  |\n"
                + "| Value | 1  | 2  | 3  | 4  | 5  |\n";
        assertEquals(0, diceTotal);
        assertNotNull(diceCard);
        Board instance = new Board();
        assertNotNull(instance);
        Dice d1 = new Dice(1);
        Dice d2 = new Dice(2);
        Dice d3 = new Dice(3);
        Dice d4 = new Dice(4);
        Dice d5 = new Dice(5);
        String output = instance.diceValues(d1.getValue(), d2.getValue(), d3.getValue(), d4.getValue(), d5.getValue());
        assertEquals(diceCard, output);
    }

    /**
     * Test of diceTotal method, of class Board.
     */
    @Test
    public void testDiceTotal() {
        System.out.println("diceValues");
        int diceTotal = 0;
        assertEquals(0, diceTotal);
        Board instance = new Board();
        assertNotNull(instance);
        Dice d1 = new Dice(1);
        Dice d2 = new Dice(2);
        Dice d3 = new Dice(3);
        Dice d4 = new Dice(4);
        Dice d5 = new Dice(5);
        diceTotal = instance.diceTotal(d1.getValue(), d2.getValue(), d3.getValue(), d4.getValue(), d5.getValue());
        assertEquals(15, diceTotal);
    }

    /**
     * Test of activeDice method, of class Board.
     */
    @Test
    public void testActiveDice() {
        System.out.println("activeDice");
        Board instance = new Board();
        assertNotNull(instance);
        assertEquals(0, instance.getActiveOnes());
        assertEquals(0, instance.getActiveTwos());
        assertEquals(0, instance.getActiveThrees());
        assertEquals(0, instance.getActiveFours());
        assertEquals(0, instance.getActiveFives());
        assertEquals(0, instance.getActiveSixes());
        instance.activeDice(instance, 1);
        instance.activeDice(instance, 2);
        instance.activeDice(instance, 3);
        instance.activeDice(instance, 4);
        instance.activeDice(instance, 5);
        instance.activeDice(instance, 6);
        assertEquals(1, instance.getActiveOnes());
        assertEquals(1, instance.getActiveTwos());
        assertEquals(1, instance.getActiveThrees());
        assertEquals(1, instance.getActiveFours());
        assertEquals(1, instance.getActiveFives());
        assertEquals(1, instance.getActiveSixes());
        instance.activeDice(instance, 1);
        instance.activeDice(instance, 2);
        instance.activeDice(instance, 3);
        instance.activeDice(instance, 4);
        instance.activeDice(instance, 5);
        instance.activeDice(instance, 6);
        assertEquals(2, instance.getActiveOnes());
        assertEquals(2, instance.getActiveTwos());
        assertEquals(2, instance.getActiveThrees());
        assertEquals(2, instance.getActiveFours());
        assertEquals(2, instance.getActiveFives());
        assertEquals(2, instance.getActiveSixes());
    }
}
