package mdg;

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
                        while(!numberScanner.hasNextInt()) {
                            System.out.println("\nInput invalid, please try again.\n\n");
                            System.out.println("Place on scorecard? (1-13)");
                            numberScanner.next();
                        }
                        userInputNumber = numberScanner.nextInt();
                        if(userInputNumber>=1 && userInputNumber<14) {
                            isScorecardLocation = false;
                        } else {
                            System.out.println("\nInput invalid, please try again.\n\n");
                        }
                    }while(isScorecardLocation == true);                         
                    switch (userInputNumber) {
                        case 1:
                            scorecard.setOnes(1);
                            break;
                        case 2:
                            scorecard.setTwos(2);
                            break;
                        case 3:
                            scorecard.setThrees(3);
                            break;
                        case 4:
                            scorecard.setFours(4);
                            break;
                        case 5:
                            scorecard.setFives(5);
                            break;
                        case 6:
                            scorecard.setSixes(6);
                            break;
                        case 7:
                            scorecard.setTwoThreeMatch(7);
                            break;
                        case 8:
                            scorecard.setThreeMatch(8);
                            break;
                        case 9:
                            scorecard.setFourMatch(9);
                            break;
                        case 10:
                            scorecard.setFiveMatch(10);
                            break;
                        case 11:
                            scorecard.setThreeLine(11);
                            break;
                        case 12:
                            scorecard.setFourLine(12);
                            break;
                        case 13:
                            scorecard.setExtras(13);
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
