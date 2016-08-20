import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Sashko on 8/20/16.
 */
public class Chapter03TapeEquilibriumTest extends TestCase {

    private Chapter03TapeEquilibrium obj = new Chapter03TapeEquilibrium();

    @Test
    public void test() {
        assertEquals(20, obj.solution(new int[] {-10, -20, -30, -40, 100}));
        assertEquals(1, obj.solution(new int[] {3, 1, 2, 4, 3}));
    }

}