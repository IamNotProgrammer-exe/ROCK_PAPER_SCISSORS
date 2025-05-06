package modules;

import static modules.GeneralChoices.*;

public class WhoWon {

    public String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "Draw!";
        }
        else if ((userChoice == ROCK && computerChoice == SCISSORS) ||
                (userChoice == PAPER && computerChoice == ROCK) ||
                (userChoice == SCISSORS && computerChoice == PAPER)) {
            return "You won!";
        } else {
            return "You loose!";
        }
    }
}
