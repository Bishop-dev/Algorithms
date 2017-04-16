import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Sashko on 4/16/17.
 */
public class EquiTestTest extends TestCase {

    private EquiTest obj = new EquiTest();

    @Test
    public void testSolution() {
        assertEquals(1, obj.solution(new int[] {1, 2, 1}));
        assertEquals(1, obj.solution(new int[] {-1, 3, -4, 5, 1, -6, 2, 1}));
        assertEquals(1, obj.solution(new int[] {1082132608, 0, 1082132608}));
        assertEquals(0, obj.solution(new int[] {500, 1, -2, -1, 2}));
        assertEquals(4, obj.solution(new int[] {2, -1, -2, 1, 500}));
        assertEquals(3, obj.solution(new int[] {1, 2, -3, 0}));
        assertEquals(1, obj.solution(new int[] {0, -1}));
        assertEquals(2, obj.solution(new int[] {-1, 1, 0}));

    }

}