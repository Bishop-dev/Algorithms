import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Sashko on 2/28/17.
 */
public class Chapter7WallStoneTest extends TestCase {

    private final Chapter7WallStone obj = new Chapter7WallStone();

    @Test
    public void testSolution() throws Exception {
        assertEquals(3, obj.solution(new int[] {2, 3, 2, 1}));
        assertEquals(7, obj.solution(new int[] {8, 8, 5, 7, 9, 8, 7, 4, 8}));
        assertEquals(3, obj.solution(new int[] {1, 2, 3}));
        assertEquals(3, obj.solution(new int[] {3, 2, 1}));
    }

}