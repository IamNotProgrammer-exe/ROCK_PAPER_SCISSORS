import modules.GetUserChoice;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.internal.protocols.Input;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class UserChoiceTest {

    @Test
    public void testChoice_ValidInput() {

        String simulatedInput = "1";
        InputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in);

        GetUserChoice userChoiceGetter = new GetUserChoice();
        int choice = userChoiceGetter.getChoice();

        assertEquals(1, choice, "User's choice should be equal to 1");
    }

    @Test
    public void testChoice_InvalidInput() {

        String simulatedInput = "abc\n2";
        InputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in);

        GetUserChoice userChoiceGetter = new GetUserChoice();
        int choice = userChoiceGetter.getChoice();

        assertEquals(2, choice, "User's choice should be equal to 2");
    }
}
