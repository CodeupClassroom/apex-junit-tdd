import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfHashPasswordSetsHash(){
        CodeupCrypt.hashPassword("fer");
        assertEquals("f3r", CodeupCrypt.hash);
        assertEquals("c0d39p", CodeupCrypt.hashPassword("codeup"));

    }

    @Test
    public void testIfCheckPasswordWorks(){
        assertTrue(CodeupCrypt.checkPassword("fer", "f3r"));
    }
}
