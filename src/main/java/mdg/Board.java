package mdg;

/**
 *  Developer: Matthew Dear
 *  GitHub: http://www.github.com/mattdear
 */

public class Board {
    private int activeOnes;
    private int activeTwos;
    private int activeThrees;
    private int activeFours;
    private int activeFives;
    private int activeSixes;

    public Board() {
        this.activeOnes = 0;
        this.activeTwos = 0;
        this.activeThrees = 0;
        this.activeFours = 0;
        this.activeFives = 0;
        this.activeSixes = 0;
    }

    public int getActiveOnes() {
        return activeOnes;
    }

    public void setActiveOnes(int activeOnes) {
        this.activeOnes = activeOnes;
    }

    public int getActiveTwos() {
        return activeTwos;
    }

    public void setActiveTwos(int activeTwos) {
        this.activeTwos = activeTwos;
    }

    public int getActiveThrees() {
        return activeThrees;
    }

    public void setActiveThrees(int activeThrees) {
        this.activeThrees = activeThrees;
    }

    public int getActiveFours() {
        return activeFours;
    }

    public void setActiveFours(int activeFours) {
        this.activeFours = activeFours;
    }

    public int getActiveFives() {
        return activeFives;
    }

    public void setActiveFives(int activeFives) {
        this.activeFives = activeFives;
    }

    public int getActiveSixes() {
        return activeSixes;
    }

    public void setActiveSixes(int activeSixes) {
        this.activeSixes = activeSixes;
    }
    public String diceValues(int dice1, int dice2, int dice3, int dice4, int dice5) {
        String output = "\n| Roll --------------------------|\n"
                + "| Dice  | 1  | 2  | 3  | 4  | 5  |\n"
                + "| Value | " + dice1 + "  | " + dice2 + "  | " + dice3 + "  | " + dice4 + "  | " + dice5 + "  |\n";

        return output;
    }
}
