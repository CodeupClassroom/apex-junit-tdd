import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void testIfStringMatches(){
        String company = "Codeup";
        assertEquals("Codeup", company);
        assertNotEquals("CodeUp", company);
    }
}
