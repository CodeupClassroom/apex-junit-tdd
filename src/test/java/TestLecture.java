import org.junit.Test;
import static org.junit.Assert.*;

public class TestLecture {

    @Test
    public void myFirstTest(){
        String company = "Codeup";
        assertEquals("Codeup", company);
//        assertEquals("codeup", company);
    }

    // When you're using floating points values a third parameter is required (Delta) which represents a positive margin of error of decimals.

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);

    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        System.out.println("dog.toString() = " + dog.toString());
        System.out.println("sheep.toString() = " + sheep.toString());

        Object clonnedSheep = sheep;

        System.out.println("clonnedSheep.clonnedSheep() = " + clonnedSheep.toString());

        assertNotSame(sheep, dog);
        assertSame(sheep, clonnedSheep);
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfBooleansWork(){
        assertTrue("F".equals("F"));
        boolean var = 1 == 0;
        assertFalse(var);
    }

}
