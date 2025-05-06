import modules.WhoWon;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class WhoWonTest {

    @Test
    public void testDetermineWinner_Draw() {
        WhoWon whoWon = new WhoWon();
        assertEquals("Draw!", whoWon.determineWinner(0, 0));
        assertEquals("Draw!", whoWon.determineWinner(1, 1));
        assertEquals("Draw!", whoWon.determineWinner(2, 2));
    }

    @Test
    public void testDetermineWinner_UserWins() {
        WhoWon whoWon = new WhoWon();
        assertEquals("You won!", whoWon.determineWinner(0, 2));
        assertEquals("You won!", whoWon.determineWinner(1, 0));
        assertEquals("You won!", whoWon.determineWinner(2, 1));
    }

    @Test
    public void testDetermineWinner_ComputerWins() {
        WhoWon whoWon = new WhoWon();
        assertEquals("You loose!", whoWon.determineWinner(0, 1));
        assertEquals("You loose!", whoWon.determineWinner(1, 2));
        assertEquals("You loose!", whoWon.determineWinner(2, 0));
    }
}

