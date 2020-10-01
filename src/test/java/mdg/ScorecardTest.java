package mdg;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  Developer: Matthew Dear
 *  GitHub: http://www.github.com/mattdear
 */

public class ScorecardTest {
    
    /**
     * Test of constructor method, of class Scorecard.
     */
    public void testConstruct() {
        System.out.println("Start scoreboardTestConstruct");
        Scorecard instance = new Scorecard();
        assertNotNull(instance);
    }
    
    /**
     * Test of getOnes method, of class Scorecard.
     */
    @Test
    public void testGetOnes() {
        System.out.println("getOnes");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getOnes();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOnes method, of class Scorecard.
     */
    @Test
    public void testSetOnes() {
        System.out.println("setOnes");
        int ones = 1;
        Scorecard instance = new Scorecard();
        instance.setOnes(ones);
        assertEquals(ones, instance.getOnes());
    }

    /**
     * Test of getTwos method, of class Scorecard.
     */
    @Test
    public void testGetTwos() {
        System.out.println("getTwos");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getTwos();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTwos method, of class Scorecard.
     */
    @Test
    public void testSetTwos() {
        System.out.println("setTwos");
        int twos = 2;
        Scorecard instance = new Scorecard();
        instance.setTwos(twos);
        assertEquals(twos, instance.getTwos());
    }

    /**
     * Test of getThrees method, of class Scorecard.
     */
    @Test
    public void testGetThrees() {
        System.out.println("getThrees");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getThrees();
        assertEquals(expResult, result);
    }

    /**
     * Test of setThrees method, of class Scorecard.
     */
    @Test
    public void testSetThrees() {
        System.out.println("setThrees");
        int threes = 3;
        Scorecard instance = new Scorecard();
        instance.setThrees(threes);
        assertEquals(threes, instance.getThrees());        
    }

    /**
     * Test of getFours method, of class Scorecard.
     */
    @Test
    public void testGetFours() {
        System.out.println("getFours");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getFours();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFours method, of class Scorecard.
     */
    @Test
    public void testSetFours() {
        System.out.println("setFours");
        int fours = 4;
        Scorecard instance = new Scorecard();
        instance.setFours(fours);
        assertEquals(fours, instance.getFours());
    }

    /**
     * Test of getFives method, of class Scorecard.
     */
    @Test
    public void testGetFives() {
        System.out.println("getFives");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getFives();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFives method, of class Scorecard.
     */
    @Test
    public void testSetFives() {
        System.out.println("setFives");
        int fives = 5;
        Scorecard instance = new Scorecard();
        instance.setFives(fives);
        assertEquals(fives, instance.getFives());
    }

    /**
     * Test of getSixes method, of class Scorecard.
     */
    @Test
    public void testGetSixes() {
        System.out.println("getSixes");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getSixes();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSixes method, of class Scorecard.
     */
    @Test
    public void testSetSixes() {
        System.out.println("setSixes");
        int sixes = 6;
        Scorecard instance = new Scorecard();
        instance.setSixes(sixes);
        assertEquals(sixes, instance.getSixes());
    }

    /**
     * Test of getTopBonus method, of class Scorecard.
     */
    @Test
    public void testGetTopBonus() {
        System.out.println("getTopBonus");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getTopBonus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTopBonus method, of class Scorecard.
     */
    @Test
    public void testSetTopBonus() {
        System.out.println("setTopBonus");
        int topBonus = 7;
        Scorecard instance = new Scorecard();
        instance.setTopBonus(topBonus);
        assertEquals(topBonus, instance.getTopBonus());
    }

    /**
     * Test of getTopScore method, of class Scorecard.
     */
    @Test
    public void testGetTopScore() {
        System.out.println("getTopScore");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getTopScore();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTopScore method, of class Scorecard.
     */
    @Test
    public void testSetTopScore() {
        System.out.println("setTopScore");
        int topScore = 8;
        Scorecard instance = new Scorecard();
        instance.setTopScore(topScore);
        assertEquals(topScore, instance.getTopScore());
    }

    /**
     * Test of getTwoThreeMatch method, of class Scorecard.
     */
    @Test
    public void testGetTwoThreeMatch() {
        System.out.println("getTwoThreeMatch");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getTwoThreeMatch();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTwoThreeMatch method, of class Scorecard.
     */
    @Test
    public void testSetTwoThreeMatch() {
        System.out.println("setTwoThreeMatch");
        int twoThreeMatch = 9;
        Scorecard instance = new Scorecard();
        instance.setTwoThreeMatch(twoThreeMatch);
        assertEquals(twoThreeMatch, instance.getTwoThreeMatch());
    }

    /**
     * Test of getThreeMatch method, of class Scorecard.
     */
    @Test
    public void testGetThreeMatch() {
        System.out.println("getThreeMatch");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getThreeMatch();
        assertEquals(expResult, result);
    }

    /**
     * Test of setThreeMatch method, of class Scorecard.
     */
    @Test
    public void testSetThreeMatch() {
        System.out.println("setThreeMatch");
        int threeMatch = 10;
        Scorecard instance = new Scorecard();
        instance.setThreeMatch(threeMatch);
        assertEquals(threeMatch, instance.getThreeMatch());
    }

    /**
     * Test of getFourMatch method, of class Scorecard.
     */
    @Test
    public void testGetFourMatch() {
        System.out.println("getFourMatch");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getFourMatch();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFourMatch method, of class Scorecard.
     */
    @Test
    public void testSetFourMatch() {
        System.out.println("setFourMatch");
        int fourMatch = 11;
        Scorecard instance = new Scorecard();
        instance.setFourMatch(fourMatch);
        assertEquals(fourMatch, instance.getFourMatch());
    }

    /**
     * Test of getFiveMatch method, of class Scorecard.
     */
    @Test
    public void testGetFiveMatch() {
        System.out.println("getFiveMatch");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getFiveMatch();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFiveMatch method, of class Scorecard.
     */
    @Test
    public void testSetFiveMatch() {
        System.out.println("setFiveMatch");
        int fiveMatch = 12;
        Scorecard instance = new Scorecard();
        instance.setFiveMatch(fiveMatch);
        assertEquals(fiveMatch, instance.getFiveMatch());
    }

    /**
     * Test of getThreeLine method, of class Scorecard.
     */
    @Test
    public void testGetThreeLine() {
        System.out.println("getThreeLine");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getThreeLine();
        assertEquals(expResult, result);
    }

    /**
     * Test of setThreeLine method, of class Scorecard.
     */
    @Test
    public void testSetThreeLine() {
        System.out.println("setThreeLine");
        int threeLine = 13;
        Scorecard instance = new Scorecard();
        instance.setThreeLine(threeLine);
        assertEquals(threeLine, instance.getThreeLine());
    }

    /**
     * Test of getFourLine method, of class Scorecard.
     */
    @Test
    public void testGetFourLine() {
        System.out.println("getFourLine");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getFourLine();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFourLine method, of class Scorecard.
     */
    @Test
    public void testSetFourLine() {
        System.out.println("setFourLine");
        int fourLine = 14;
        Scorecard instance = new Scorecard();
        instance.setFourLine(fourLine);
        assertEquals(fourLine, instance.getFourLine());
    }

    /**
     * Test of getExtras method, of class Scorecard.
     */
    @Test
    public void testGetExtras() {
        System.out.println("getExtras");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getExtras();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExtras method, of class Scorecard.
     */
    @Test
    public void testSetExtras() {
        System.out.println("setExtras");
        int extras = 15;
        Scorecard instance = new Scorecard();
        instance.setExtras(extras);
        assertEquals(extras, instance.getExtras());
    }

    /**
     * Test of getBottomScore method, of class Scorecard.
     */
    @Test
    public void testGetBottomScore() {
        System.out.println("getBottomScore");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getBottomScore();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBottomScore method, of class Scorecard.
     */
    @Test
    public void testSetBottomScore() {
        System.out.println("setBottomScore");
        int bottomScore = 16;
        Scorecard instance = new Scorecard();
        instance.setBottomScore(bottomScore);
        assertEquals(bottomScore, instance.getBottomScore());
    }

    /**
     * Test of getTotalScore method, of class Scorecard.
     */
    @Test
    public void testGetTotalScore() {
        System.out.println("getTotalScore");
        Scorecard instance = new Scorecard();
        int expResult = 0;
        int result = instance.getTotalScore();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTotalScore method, of class Scorecard.
     */
    @Test
    public void testSetTotalScore() {
        System.out.println("setTotalScore");
        int totalScore = 17;
        Scorecard instance = new Scorecard();
        instance.setTotalScore(totalScore);
        assertEquals(totalScore, instance.getTotalScore());
    }
    
    /**
     * Test of display method, of class Scorecard.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Scorecard instance = new Scorecard();
    String output = "\n|      MDG Scorecard     |\n"
                     + "| Top Section -----------|\n"
                     + "| 1  | Ones          | 0 |\n"
                     + "| 2  | Twos          | 0 |\n"
                     + "| 3  | Threes        | 0 |\n"
                     + "| 4  | Fours         | 0 |\n"
                     + "| 5  | Fives         | 0 |\n"
                     + "| 6  | Sixes         | 0 |\n"
                     + "| -  | Bonus         | 0 |\n"
                     + "| Bottom Section --------|\n"
                     + "| 7  | 2/3 Match     | 0 |\n"
                     + "| 8  | 3 Match       | 0 |\n"
                     + "| 9  | 4 Match       | 0 |\n"
                     + "| 10 | 5 Match       | 0 |\n"
                     + "| 11 | 3 Line        | 0 |\n"
                     + "| 12 | 4 Line        | 0 |\n"
                     + "| 13 | Extra         | 0 |\n"
                     + "| Totals ----------------|\n"
                     + "| -  | Top Score     | 0 |\n" 
                     + "| -  | Bottom Score  | 0 |\n"         
                     + "| -  | Total Score   | 0 |\n";
        assertEquals(output, instance.display());
    }
    
    /**
     * Test of calcTopScore method, of class Scorecard.
     */
    @Test
    public void testCalcTopScore() {
        System.out.println("calcTopScore");
        int topScore = 21;
        int topBonus = 0;
        Scorecard instance = new Scorecard();
        assertEquals(0, instance.getTopScore());
        instance.setOnes(1);
        instance.setTwos(2);
        instance.setThrees(3);
        instance.setFours(4);
        instance.setFives(5); 
        instance.setSixes(6);
        instance.calcTopScore();
        assertEquals(topScore, instance.getTopScore());
        assertEquals(topBonus, instance.getTopBonus());
    }
    
    /**
     * Test of calcTopScoreWithBonus method, of class Scorecard.
     */
    @Test
    public void testCalcTopScoreWithBonus() {
        System.out.println("calcTopScoreWithBonus");
        int topScore = 119;
        int topBonus = 35;
        Scorecard instance = new Scorecard();
        assertEquals(0, instance.getTopScore());
        instance.setOnes(4);
        instance.setTwos(8);
        instance.setThrees(12);
        instance.setFours(16);
        instance.setFives(20); 
        instance.setSixes(24);
        instance.calcTopScore();
        assertEquals(topScore, instance.getTopScore());
        assertEquals(topBonus, instance.getTopBonus());
    }
    
    /**
     * Test of calcTopScoreWithBonusOn63 method, of class Scorecard.
     */
    @Test
    public void testCalcTopScoreWithBonusOn63() {
        System.out.println("calcTopScoreWithBonuson63");
        int topScore = 98;
        int topBonus = 35;
        Scorecard instance = new Scorecard();
        assertEquals(0, instance.getTopScore());
        instance.setOnes(0);
        instance.setTwos(0);
        instance.setThrees(3);
        instance.setFours(16);
        instance.setFives(20); 
        instance.setSixes(24);
        instance.calcTopScore();
        assertEquals(topScore, instance.getTopScore());
        assertEquals(topBonus, instance.getTopBonus());
    }
    
    /**
     * Test of calcTopScoreWithoutBonusOn62 method, of class Scorecard.
     */
    @Test
    public void testCalcTopScoreWithoutBonusOn62() {
        System.out.println("calcTopScoreWithoutBonuson62");
        int topScore = 62;
        int topBonus = 0;
        Scorecard instance = new Scorecard();
        assertEquals(0, instance.getTopScore());
        instance.setOnes(0);
        instance.setTwos(2);
        instance.setThrees(0);
        instance.setFours(16);
        instance.setFives(20); 
        instance.setSixes(24);
        instance.calcTopScore();
        assertEquals(topScore, instance.getTopScore());
        assertEquals(topBonus, instance.getTopBonus());
    }
    
    /**
     * Test of calcBottomScore method, of class Scorecard.
     */
    @Test
    public void testCalcBottomScore() {
        System.out.println("calcBottomScore");
        int bottomScore = 28;
        Scorecard instance = new Scorecard();
        assertEquals(0, instance.getBottomScore());
        instance.setTwoThreeMatch(1);
        instance.setThreeMatch(2);
        instance.setFourMatch(3);
        instance.setFiveMatch(4);
        instance.setThreeLine(5);
        instance.setFourLine(6);
        instance.setExtras(7);   
        instance.calcBottomScore();
        assertEquals(bottomScore, instance.getBottomScore());
    }
    
    /**
     * Test of calcTotalScore method, of class Scorecard.
     */
    @Test
    public void testCalcTotalScore() {
        System.out.println("calcTotalScore");
        int totalScore = 49;
        Scorecard instance = new Scorecard();
        assertEquals(0, instance.getTotalScore());
        instance.setOnes(1);
        instance.setTwos(2);
        instance.setThrees(3);
        instance.setFours(4);
        instance.setFives(5); 
        instance.setSixes(6);
        instance.setTwoThreeMatch(1);
        instance.setThreeMatch(2);
        instance.setFourMatch(3);
        instance.setFiveMatch(4);
        instance.setThreeLine(5);
        instance.setFourLine(6);
        instance.setExtras(7);
        instance.calcTopScore();
        instance.calcBottomScore();
        instance.calcTotalScore();
        assertEquals(totalScore, instance.getTotalScore());
    }
    
}
