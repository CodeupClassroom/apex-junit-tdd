import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student fer;

    @Before
    public void init(){
        fer = new Student(1L, "Fer");
    }

    @Test
    public void testIfIdWorks(){
        assertEquals(1L, fer.getId());
    }

    @Test
    public void testIfNameWorks(){
        assertEquals("Fer", fer.getName());
    }

}