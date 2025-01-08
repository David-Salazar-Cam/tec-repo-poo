package tec.poo.tareas;

import java.util.Scanner;

import static tec.poo.tareas.Config.*;

public class App {

    public static void main(String... args) {

        BattleshipGame game = new BattleshipGame();
        game.gameSetup();

        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (i < BOARD_SIZE) {
            int guess = getUserInput("Enter a guess: ", scanner);
            var battleship = game.getBattleshipFromGuess(guess);
            var status = game.verifyBattleshipStatus(battleship);
            if (!game.areAllShipsAlive()) {
                break;
            }
            System.out.println(status);
            i++;
        }
        // Closing the scanner
        scanner.close();
        System.out.println("You took " + game.getNumberOfHits() + " guesses");
    }

    private static int getUserInput(String prompt, Scanner scanner) {
        scanner = new Scanner(System.in);
        System.out.print(prompt + " ");
        return scanner.nextInt();
    }

}