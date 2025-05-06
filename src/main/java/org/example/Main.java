package org.example;

import modules.GetComputerChoice;
import modules.GetUserChoice;
import modules.WhoWon;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuePlaying = true;

        int userScore = 0;
        int computerScore = 0;

        while (continuePlaying){

        GetUserChoice userChoiceGetter = new GetUserChoice();
        int userChoice = userChoiceGetter.getChoice();

        GetComputerChoice computerChoiceGetter = new GetComputerChoice();
        int computerChoice = computerChoiceGetter.getChoice();

        String userChoiceText = (userChoice == 0) ? "ROCK" : (userChoice == 1) ? "PAPER" : "SCISSORS";
        String computerChoiceText = (computerChoice == 0) ? "ROCK" : (computerChoice == 1) ? "PAPER" : "SCISSORS";

        System.out.println("Your choice: " + userChoiceText);
        System.out.println("Computer's choice: " + computerChoiceText);

        WhoWon winnerDeterminer = new WhoWon();
        String result = winnerDeterminer.determineWinner(userChoice, computerChoice);
        System.out.println(result);

        if (result.equals("You won!")) {
            userScore++;
        } else if (result.equals("You loose!")) {
            computerScore++;
        }

        System.out.println("Scores:");
        System.out.println("You: " + userScore);
        System.out.println("Computer: " + computerScore);
        continuePlaying = askToContinue(scanner);

        }
        System.out.println("Thank you for playing!");
        System.out.println("Final scores:");
        System.out.println("You: " + userScore);
        System.out.println("Computer: " + computerScore);
        scanner.close();
    }

    private static boolean askToContinue(Scanner scanner) {
        String userResponse;
        while (true) {
            System.out.println("Do you want to play again? (Yes/No)");
            userResponse = scanner.next();

            if (userResponse.equalsIgnoreCase("Yes")) {
                return true;
            } else if (userResponse.equalsIgnoreCase("No")) {
                return false;
            } else {
                System.out.println("Incorrect answer. Please put 'Yes or 'No");
            }
        }
    }
}