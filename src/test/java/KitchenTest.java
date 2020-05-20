import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KitchenTest {

    Kitchen emptyKitchen = new Kitchen();
    Kitchen kitchenWithOne = new Kitchen();

    @Before
    public void setup(){
        kitchenWithOne.add("blue corn");
    }

    @Test
    public void testIfEmptyWorks(){
        assertTrue(emptyKitchen.isEmpty());
    }

    @Test
    public void testIfAddWorks(){
        assertFalse(kitchenWithOne.isEmpty());
    }

    @Test
    public void testIfPopWorks(){
        kitchenWithOne.pop();
        assertTrue(kitchenWithOne.isEmpty());
    }

}
