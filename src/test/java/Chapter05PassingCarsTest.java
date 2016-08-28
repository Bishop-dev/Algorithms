import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Sashko on 8/26/16.
 */
public class Chapter05PassingCarsTest extends TestCase {

    private Chapter05PassingCars obj = new Chapter05PassingCars();

    @Test
    public void test() {
        assertEquals(5, obj.solution(new int[]{0, 1, 0, 1, 1}));
    }

}