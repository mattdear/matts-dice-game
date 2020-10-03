package mdg;

import java.util.ArrayList;
import java.util.Collections;
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
                    System.out.println(scorecard.display());
                    System.out.println(board.diceValues(d1.getValue(), d2.getValue(), d3.getValue(), d4.getValue(), d5.getValue()));
                    System.out.println("Round " + gameCycles + " of 13");

                    boolean isScorecardLocation = true;
                    do {
                        System.out.println("Place on scorecard? (1-13)");
                        while (!numberScanner.hasNextInt()) {
                            System.out.println("\nInput invalid, please try again.\n\n");
                            System.out.println("Place on scorecard? (1-13)");
                            numberScanner.next();
                        }
                        userInputNumber = numberScanner.nextInt();
                        ArrayList<String> diceArray = new ArrayList<String>();
                        diceArray.add(Integer.toString(d1.getValue()));
                        diceArray.add(Integer.toString(d2.getValue()));
                        diceArray.add(Integer.toString(d3.getValue()));
                        diceArray.add(Integer.toString(d4.getValue()));
                        diceArray.add(Integer.toString(d5.getValue()));
                        Collections.sort(diceArray);
                        String diceCompare = diceArray.toString();
                        if (userInputNumber == 1) {
                            if (scorecard.getOnes() == 0 && board.getActiveOnes() > 0) {
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 2) {
                            if (scorecard.getTwos() == 0 && board.getActiveTwos() > 0) {
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 3) {
                            if (scorecard.getThrees() == 0 && board.getActiveThrees() > 0) {
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 4) {
                            if (scorecard.getFours() == 0 && board.getActiveFours() > 0) {
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 5) {
                            if (scorecard.getFives() == 0 && board.getActiveFives() > 0) {
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 6) {
                            if (scorecard.getSixes() == 0 && board.getActiveSixes() > 0) {
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 7) {
                            if ((board.getActiveOnes() == 2 || board.getActiveTwos() == 2 || board.getActiveThrees() == 2 || board.getActiveFours() == 2 || board.getActiveFives() == 2 || board.getActiveSixes() == 2) && (board.getActiveOnes() == 3 || board.getActiveTwos() == 3 || board.getActiveThrees() == 3 || board.getActiveFours() == 3 || board.getActiveFives() == 3 || board.getActiveSixes() == 3) && scorecard.getTwoThreeMatch() == 0) {
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 8) {
                            if ((board.getActiveOnes() == 3 || board.getActiveTwos() == 3 || board.getActiveThrees() == 3 || board.getActiveFours() == 3 || board.getActiveFives() == 3 || board.getActiveSixes() == 3) && scorecard.getThreeMatch() == 0) {
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 9) {
                            if ((board.getActiveOnes() == 4 || board.getActiveTwos() == 4 || board.getActiveThrees() == 4 || board.getActiveFours() == 4 || board.getActiveFives() == 4 || board.getActiveSixes() == 4) && scorecard.getFourMatch() == 0) {
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 10) {
                            if ((diceCompare.equals("11111") || diceCompare.equals("22222") || diceCompare.equals("33333") || diceCompare.equals("44444") || diceCompare.equals("55555")) && scorecard.getFiveMatch() == 0) {
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 11) {
                            if (((d1.getValue() + 2) == d3.getValue() || (d2.getValue() + 2) == d4.getValue() || (d3.getValue() + 2) == d5.getValue()) && scorecard.getThreeLine() == 0) {
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 12) {
                            if (((d1.getValue() + 3) == d4.getValue() || (d2.getValue() + 3) == d5.getValue()) && scorecard.getFourLine() == 0) {
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else if (userInputNumber == 13) {
                            if (scorecard.getExtras() == 0) {
                                isScorecardLocation = false;
                            } else {
                                System.out.println("\nInput invalid, please try again.\n\n");
                            }
                        } else {
                            System.out.println("\nInput invalid, please try again.\n\n");
                        }
                    } while (isScorecardLocation == true);
                    int diceTotal = board.diceTotal(d1.getValue(), d2.getValue(), d3.getValue(), d4.getValue(), d5.getValue());
                    board.activeDice(board, d1.getValue());
                    board.activeDice(board, d2.getValue());
                    board.activeDice(board, d3.getValue());
                    board.activeDice(board, d4.getValue());
                    board.activeDice(board, d5.getValue());
                    switch (userInputNumber) {
                        case 1: //Ones
                            scorecard.setOnes(board.getActiveOnes());
                            break;
                        case 2: //Twos
                            scorecard.setTwos(board.getActiveTwos());
                            break;
                        case 3: //Threes
                            scorecard.setThrees(board.getActiveThrees());
                            break;
                        case 4: //Fours
                            scorecard.setFours(board.getActiveFours());
                            break;
                        case 5: //Fives
                            scorecard.setFives(board.getActiveFives());
                            break;
                        case 6: //Sixes
                            scorecard.setSixes(board.getActiveSixes());
                            break;
                        case 7: //2 3 Match
                            scorecard.setTwoThreeMatch(25);
                            break;
                        case 8: //3 Match
                            scorecard.setThreeMatch(diceTotal);
                            break;
                        case 9: //4 Match
                            scorecard.setFourMatch(diceTotal);
                            break;
                        case 10: //5 Match
                            scorecard.setFiveMatch(50);
                            break;
                        case 11: //3 Line
                            scorecard.setThreeLine(30);
                            break;
                        case 12: //4 Line
                            scorecard.setFourLine(40);
                            break;
                        case 13: //Extra
                            scorecard.setExtras(diceTotal);
                            break;
                    }
                    scorecard.calcTopScore();
                    scorecard.calcBottomScore();
                    scorecard.calcTotalScore();
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
