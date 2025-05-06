package modules;

import java.util.Scanner;

public class GetUserChoice {

    public int getChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice < 0 || choice > 2 ) {
            System.out.println("Choose: 0 - ROCK, 1 - PAPER, 2 - SCISSORS");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 0 || choice > 2) {
                    System.out.println("Incorrect choice. Choose 0, 1 or 2.");
                }
            } else {
                System.out.println("Incorrect data.");
                scanner.next();
            }
        }
    return choice;
    }
}
