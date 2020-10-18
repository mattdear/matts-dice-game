package mdg;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Developer: Matthew Dear 
 * GitHub: http://www.github.com/mattdear
 */

public class Game {

    public static void main(String[] args) {
        //------------------------------ Main Program Begins ------------------------------

        //Object creation
        Board board = new Board();
        Scorecard scorecard = new Scorecard();
        Dice d1 = new Dice(0);
        Dice d2 = new Dice(0);
        Dice d3 = new Dice(0);
        Dice d4 = new Dice(0);
        Dice d5 = new Dice(0);
        int userInputNumber = 0;
        String userInputString = null;

        //Create scanner
        Scanner numberScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        //CLI
        boolean isLoopMenu = true;
        do {
            System.out.println("--- Welcome to MDG lets play! ---\n\nPlease select one of the following options:\n1 - New Game\n2 - Exit\n");
            userInputString = stringScanner.nextLine().toUpperCase().trim();
            if (userInputString.equals("1")) {
                int gameCycles = 1;
                do {
                    //Roll dice
                    if (!d1.getHold()) {
                        d1.roll();
                    }
                    if (!d2.getHold()) {
                        d2.roll();
                    }
                    if (!d3.getHold()) {
                        d3.roll();
                    }
                    if (!d4.getHold()) {
                        d4.roll();
                    }
                    if (!d5.getHold()) {
                        d5.roll();
                    }

                    //Roll cycle
                    for (int i = 1; i < 3; i++) {
                        System.out.println(scorecard.display());
                        System.out.println(board.diceValues(d1.getValue(), d2.getValue(), d3.getValue(), d4.getValue(), d5.getValue()));
                        System.out.println("Round " + gameCycles);
                        System.out.println("Roll " + i + " of 3");
                        boolean isRollAgain = true;
                        do {
                            System.out.println("Roll again? y/n");
                            userInputString = stringScanner.nextLine().toUpperCase().trim();
                            if (userInputString.equals("Y") || userInputString.equals("N")) {
                                isRollAgain = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } while (isRollAgain == true);
                        if (userInputString.equals("N")) {
                            i = 3;

                        //Dice hold setting    
                        } else if (userInputString.equals("Y")) {
                            boolean isHoldDiceOne = true;
                            do {
                                System.out.println("Hold Dice 1? y/n");
                                userInputString = stringScanner.nextLine().toUpperCase().trim();
                                if (userInputString.equals("Y")) {
                                    d1.setHold(true);
                                    isHoldDiceOne = false;
                                } else if (userInputString.equals("N")) {
                                    d1.setHold(false);
                                    isHoldDiceOne = false;
                                } else {
                                    System.out.println("\nInput invalid, please try again.\n\n");
                                }
                            } while (isHoldDiceOne == true);
                            boolean isHoldDiceTwo = true;
                            do {
                                System.out.println("Hold Dice 2? y/n");
                                userInputString = stringScanner.nextLine().toUpperCase().trim();
                                if (userInputString.equals("Y")) {
                                    d2.setHold(true);
                                    isHoldDiceTwo = false;
                                } else if (userInputString.equals("N")) {
                                    d2.setHold(false);
                                    isHoldDiceTwo = false;
                                } else {
                                    System.out.println("\nInput invalid, please try again.\n\n");
                                }
                            } while (isHoldDiceTwo == true);
                            boolean isHoldDiceThree = true;
                            do {
                                System.out.println("Hold Dice 3? y/n");
                                userInputString = stringScanner.nextLine().toUpperCase().trim();
                                if (userInputString.equals("Y")) {
                                    d3.setHold(true);
                                    isHoldDiceThree = false;
                                } else if (userInputString.equals("N")) {
                                    d3.setHold(false);
                                    isHoldDiceThree = false;
                                } else {
                                    System.out.println("\nInput invalid, please try again.\n\n");
                                }
                            } while (isHoldDiceThree == true);
                            boolean isHoldDiceFour = true;
                            do {
                                System.out.println("Hold Dice 4? y/n");
                                userInputString = stringScanner.nextLine().toUpperCase().trim();
                                if (userInputString.equals("Y")) {
                                    d4.setHold(true);
                                    isHoldDiceFour = false;
                                } else if (userInputString.equals("N")) {
                                    d4.setHold(false);
                                    isHoldDiceFour = false;
                                } else {
                                    System.out.println("\nInput invalid, please try again.\n\n");
                                }
                            } while (isHoldDiceFour == true);
                            boolean isHoldDiceFive = true;
                            do {
                                System.out.println("Hold Dice 5? y/n");
                                userInputString = stringScanner.nextLine().toUpperCase().trim();
                                if (userInputString.equals("Y")) {
                                    d5.setHold(true);
                                    isHoldDiceFive = false;
                                } else if (userInputString.equals("N")) {
                                    d5.setHold(false);
                                    isHoldDiceFive = false;
                                } else {
                                    System.out.println("\nInput invalid, please try again.\n\n");
                                }
                            } while (isHoldDiceFive == true);

                            //Dice roll
                            if (!d1.getHold()) {
                                d1.roll();
                            }
                            if (!d2.getHold()) {
                                d2.roll();
                            }
                            if (!d3.getHold()) {
                                d3.roll();
                            }
                            if (!d4.getHold()) {
                                d4.roll();
                            }
                            if (!d5.getHold()) {
                                d5.roll();
                            }
                        } else {
                            System.out.println("\nInput invalid, please try again.\n\n");
                        }
                    }
                    
                    //Setting active dice
                    board.activeDice(board, d1.getValue());
                    board.activeDice(board, d2.getValue());
                    board.activeDice(board, d3.getValue());
                    board.activeDice(board, d4.getValue());
                    board.activeDice(board, d5.getValue());
                    System.out.println(scorecard.display());
                    System.out.println(board.diceValues(d1.getValue(), d2.getValue(), d3.getValue(), d4.getValue(), d5.getValue()));
                    System.out.println("Round " + gameCycles + " of 13");
                    boolean isScorecardLocation = true;

                    //Scorecard location loop
                    do {
                        System.out.println("Place on scorecard? (1-13)");
                        while (!numberScanner.hasNextInt()) {
                            System.out.println("\nInput invalid, please try again.\n\n");
                            System.out.println("Place on scorecard? (1-13)");
                            numberScanner.next();
                        }
                        userInputNumber = numberScanner.nextInt();
                        int diceTotal = board.diceTotal(d1.getValue(), d2.getValue(), d3.getValue(), d4.getValue(), d5.getValue());

                        //Dice added to array to be sorted
                        int[] diceArray = new int[5];
                        diceArray[0] = d1.getValue();
                        diceArray[1] = d2.getValue();
                        diceArray[2] = d3.getValue();
                        diceArray[3] = d4.getValue();
                        diceArray[4] = d5.getValue();
                        Arrays.sort(diceArray);
                        
                        //Looks at first array item and compares to the second if they are not the same the first array item will be added to the string.
                        //This continues though the array until the penultimate member. The last array member is added by default after the loop has ended. 
                        String tempDiceString = "";
                        for (int i = 0; i<4; i++){
                            if(diceArray[i] != diceArray[i+1]){
                                tempDiceString = tempDiceString + diceArray[i];
                            }
                        }
                        tempDiceString = tempDiceString + diceArray[4];
                            
                        //Scorecard input verification
                        if (userInputNumber == 1) { //Ones
                            if (scorecard.getOnes() == 0 && board.getActiveOnes() > 0) {
                                scorecard.setOnes(board.getActiveOnes()*1);
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 2) { //Twos
                            if (scorecard.getTwos() == 0 && board.getActiveTwos() > 0) {
                                scorecard.setTwos(board.getActiveTwos()*2);
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 3) { //Threes
                            if (scorecard.getThrees() == 0 && board.getActiveThrees() > 0) {
                                scorecard.setThrees(board.getActiveThrees()*3);
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 4) { //Fours
                            if (scorecard.getFours() == 0 && board.getActiveFours() > 0) {
                                scorecard.setFours(board.getActiveFours()*4);
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 5) { //Fives
                            if (scorecard.getFives() == 0 && board.getActiveFives() > 0) {
                                scorecard.setFives(board.getActiveFives()*5);
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 6) { //Sixes
                            if (scorecard.getSixes() == 0 && board.getActiveSixes() > 0) {
                                scorecard.setSixes(board.getActiveSixes()*6);
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 7) { //2 3 Match
                            if ((board.getActiveOnes() == 2 || board.getActiveTwos() == 2 || board.getActiveThrees() == 2 || board.getActiveFours() == 2 || board.getActiveFives() == 2 || board.getActiveSixes() == 2) && (board.getActiveOnes() == 3 || board.getActiveTwos() == 3 || board.getActiveThrees() == 3 || board.getActiveFours() == 3 || board.getActiveFives() == 3 || board.getActiveSixes() == 3) && scorecard.getTwoThreeMatch() == 0) {
                                scorecard.setTwoThreeMatch(25);
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 8) { //3 Match
                            if ((board.getActiveOnes() == 3 || board.getActiveTwos() == 3 || board.getActiveThrees() == 3 || board.getActiveFours() == 3 || board.getActiveFives() == 3 || board.getActiveSixes() == 3) && scorecard.getThreeMatch() == 0) {
                                scorecard.setThreeMatch(diceTotal);
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 9) { //4 Match
                            if ((board.getActiveOnes() == 4 || board.getActiveTwos() == 4 || board.getActiveThrees() == 4 || board.getActiveFours() == 4 || board.getActiveFives() == 4 || board.getActiveSixes() == 4) && scorecard.getFourMatch() == 0) {
                                scorecard.setFourMatch(diceTotal);
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 10) { //5 Match
                            if ((board.getActiveOnes() == 5 || board.getActiveTwos() == 5 || board.getActiveThrees() == 5 || board.getActiveFours() == 5 || board.getActiveFives() == 5 || board.getActiveSixes() == 5) && scorecard.getFiveMatch() == 0) {
                                scorecard.setFiveMatch(50);
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 11) { //3 Line
                            if (tempDiceString.length() >= 3 && scorecard.getThreeLine() == 0) {
                                scorecard.setThreeLine(30);
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 12) { //4 Line
                            if (tempDiceString.length() >= 4 && scorecard.getFourLine() == 0) {
                                scorecard.setFourLine(40);
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 13) { //Extras
                            if (scorecard.getExtras() == 0) {
                                scorecard.setExtras(diceTotal);
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else {
                            System.out.println("\nInput invalid, please try again.\n\n");
                        }
                        
                        //Variable reset
                        diceTotal = 0;
                    } while (isScorecardLocation == true);
                    scorecard.calcTopScore();
                    scorecard.calcBottomScore();
                    scorecard.calcTotalScore();

                    //Veriable resets
                    d1.setHold(false);
                    d2.setHold(false);
                    d3.setHold(false);
                    d4.setHold(false);
                    d5.setHold(false);
                    board.setActiveOnes(0);
                    board.setActiveTwos(0);
                    board.setActiveThrees(0);
                    board.setActiveFours(0);
                    board.setActiveFives(0);
                    board.setActiveSixes(0);
                    gameCycles = gameCycles + 1;
                } while (gameCycles < 14);
                System.out.println(scorecard.display());
                System.out.println("Your final score " + scorecard.getTotalScore() + ", Thanks for playing.\n\n\n");
            } else if (userInputString.equals("2")) {
                System.out.println("\nThanks for playing MDG, have a great day.\n\n");
                isLoopMenu = false;
            } else {
                System.out.println("\nInput invalid, please try again.\n\n");
            }

        } while (isLoopMenu == true);

        //Close scanner
        numberScanner.close();
        stringScanner.close();

        //------------------------------ Main Program Ends ------------------------------
    }
}
