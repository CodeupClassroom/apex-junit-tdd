import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    List<String> names;

    @Before
    public void setUp(){
        names = new ArrayList<>();
        names.add("Fer");
    }

    @Test
    public void testIfStringMatches(){
        String company = "Codeup";
        assertEquals("Codeup", company);
        assertNotEquals("CodeUp", company);
    }

    @Test
    public void testIfListsAreNotTheSame(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testIfArraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfWordContains(){
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }

    // We can verify that the names list is not longer null because it was initialized in the setUp() method with the following test:
    @Test
    public void testIfNamesIsInitialized(){
        assertNotNull(names);
    }

    @Test
    public void testIfFerItInTheList(){
        assertEquals("Fer", names.get(0));
        assertNotEquals("fer", names.get(0));
        assertTrue(names.contains("Fer"));
        assertFalse(names.contains("Douglas"));
    }

}
