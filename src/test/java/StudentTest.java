import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfIdWorks(){
        Student fer = new Student(1L, "Fer");
        assertEquals(1L, fer.getId());
    }

    @Test
    public void testIfNameWorks(){
        Student fer = new Student(1L, "Fer");
        assertEquals("Fer", fer.getName());
    }

}
