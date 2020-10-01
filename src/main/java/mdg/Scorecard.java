package mdg;

/**
 *  Developer: Matthew Dear
 *  GitHub: http://www.github.com/mattdear
 */

public class Scorecard {

    private int ones;
    private int twos;
    private int threes;
    private int fours;
    private int fives;
    private int sixes;
    private int topBonus;
    private int topScore;
    private int twoThreeMatch;
    private int threeMatch;
    private int fourMatch;
    private int fiveMatch;
    private int threeLine;
    private int fourLine;
    private int extras;
    private int bottomScore;
    private int totalScore;

    public Scorecard() {
        this.ones = 0;
        this.twos = 0;
        this.threes = 0;
        this.fours = 0;
        this.fives = 0;
        this.sixes = 0;
        this.topBonus = 0;
        this.topScore = 0;
        this.twoThreeMatch = 0;
        this.threeMatch = 0;
        this.fourMatch = 0;
        this.fiveMatch = 0;
        this.threeLine = 0;
        this.fourLine = 0;
        this.extras = 0;
        this.bottomScore = 0;
        this.totalScore = 0;
    }

    public int getOnes() {
        return ones;
    }

    public void setOnes(int ones) {
        this.ones = ones;
    }

    public int getTwos() {
        return twos;
    }

    public void setTwos(int twos) {
        this.twos = twos;
    }

    public int getThrees() {
        return threes;
    }

    public void setThrees(int threes) {
        this.threes = threes;
    }

    public int getFours() {
        return fours;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public int getFives() {
        return fives;
    }

    public void setFives(int fives) {
        this.fives = fives;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public int getTopBonus() {
        return topBonus;
    }

    public void setTopBonus(int topBonus) {
        this.topBonus = topBonus;
    }

    public int getTopScore() {
        return topScore;
    }

    public void setTopScore(int topScore) {
        this.topScore = topScore;
    }

    public int getTwoThreeMatch() {
        return twoThreeMatch;
    }

    public void setTwoThreeMatch(int twoThreeMatch) {
        this.twoThreeMatch = twoThreeMatch;
    }

    public int getThreeMatch() {
        return threeMatch;
    }

    public void setThreeMatch(int threeMatch) {
        this.threeMatch = threeMatch;
    }

    public int getFourMatch() {
        return fourMatch;
    }

    public void setFourMatch(int fourMatch) {
        this.fourMatch = fourMatch;
    }

    public int getFiveMatch() {
        return fiveMatch;
    }

    public void setFiveMatch(int fiveMatch) {
        this.fiveMatch = fiveMatch;
    }

    public int getThreeLine() {
        return threeLine;
    }

    public void setThreeLine(int threeLine) {
        this.threeLine = threeLine;
    }

    public int getFourLine() {
        return fourLine;
    }

    public void setFourLine(int fourLine) {
        this.fourLine = fourLine;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    public int getBottomScore() {
        return bottomScore;
    }

    public void setBottomScore(int bottomScore) {
        this.bottomScore = bottomScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public String display(){
    
    String output = "\n|      MDG Scorecard     |\n"
                     + "| Top Section -----------|\n"
                     + "| 1  | Ones          | " + ones + " |\n"
                     + "| 2  | Twos          | " + twos + " |\n"
                     + "| 3  | Threes        | " + threes + " |\n"
                     + "| 4  | Fours         | " + fours + " |\n"
                     + "| 5  | Fives         | " + fives + " |\n"
                     + "| 6  | Sixes         | " + sixes + " |\n"
                     + "| -  | Bonus         | " + topBonus + " |\n"
                     + "| Bottom Section --------|\n"
                     + "| 7  | 2/3 Match     | " + twoThreeMatch + " |\n"
                     + "| 8  | 3 Match       | " + threeMatch + " |\n"
                     + "| 9  | 4 Match       | " + fourMatch + " |\n"
                     + "| 10 | 5 Match       | " + fiveMatch + " |\n"
                     + "| 11 | 3 Line        | " + threeLine + " |\n"
                     + "| 12 | 4 Line        | " + fourLine + " |\n"
                     + "| 13 | Extra         | " + extras + " |\n"
                     + "| Totals ----------------|\n"
                     + "| -  | Top Score     | " + topScore + " |\n" 
                     + "| -  | Bottom Score  | " + bottomScore + " |\n"         
                     + "| -  | Total Score   | " + totalScore + " |\n";
    
    return output;
    }

    public void calcTopScore(){
        topScore = ones + twos + threes + fours + fives + sixes;
        if(topScore >= 63){
            topBonus = 35;
        }
        topScore = topScore + topBonus;
    }
    
    public void calcBottomScore(){
        bottomScore = twoThreeMatch + threeMatch + fourMatch + fiveMatch + threeLine + fourLine + extras;
    }
    
    public void calcTotalScore(){
        totalScore = topScore + bottomScore;
    }
}
