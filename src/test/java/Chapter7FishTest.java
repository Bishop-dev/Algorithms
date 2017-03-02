import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Sashko on 3/2/17.
 */
public class Chapter7FishTest extends TestCase {

    private Chapter7Fish obj = new Chapter7Fish();

    @Test
    public void testSolution() throws Exception {
        assertEquals(2, obj.solution(new int[] {4, 3, 2, 1, 5}, new int[] {0, 1, 0, 0, 0}));
        assertEquals(1, obj.solution(new int[] {14, 3, 2, 1, 5}, new int[] {1, 0, 0, 0, 0}));
        assertEquals(1, obj.solution(new int[] {4, 3, 2, 1, 5}, new int[] {1, 1, 1, 1, 0}));
    }

}