package mdg;

import java.util.Scanner;

/**
 *  Developer: Matthew Dear
 *  GitHub: http://www.github.com/mattdear
 */

public class Game {

    public static void main(String[] args) {
        //------------------------------ Main Program Begins ------------------------------

        //Object creation
        Board board = new Board();
        Scorecard scorecard = new Scorecard();
        Dice d1 = new Dice(1);
        Dice d2 = new Dice(2);
        Dice d3 = new Dice(3);
        Dice d4 = new Dice(4);
        Dice d5 = new Dice(5);

        //Create scanner
        Scanner scanner = new Scanner(System.in);

        //CLI
        boolean isLoopMenu = true;
        do {
            System.out.println("--- Welcome to MDG lets play! ---\n\nPlease select one of the following options:\n1 - New Game\n2 - Exit\n");
            
            String input = scanner.nextLine().toUpperCase();
            
            if (input.equals("1")) {
                System.out.println("\nLets start a new game\n\n");
            }
            else if (input.equals("2")) {
                System.out.println("\nThanks for playing MDG, have a great day.\n\n");
		isLoopMenu = false;
            }
            else {
                System.out.println("\nInput invalid, please try again.\n\n");
            }
			
        } while (isLoopMenu == true);
        
        //Close scanner
        scanner.close();

        //------------------------------ Main Program Ends ------------------------------
    }
}
