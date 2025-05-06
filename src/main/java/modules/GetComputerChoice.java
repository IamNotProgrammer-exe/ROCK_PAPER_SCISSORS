package modules;

import java.util.Random;

public class GetComputerChoice {

    public int getChoice() {
        Random random = new Random();
        return random.nextInt(3);
    }
}
