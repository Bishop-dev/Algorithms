import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Sashko on 8/20/16.
 */
public class Chapter02CyclicRotationTest extends TestCase {
    private Chapter02CyclicRotation rotation = new Chapter02CyclicRotation();

    @Test
    public void testSolution() throws Exception {
        assertArrayEquals(rotation.solution(new int[] {3, 8, 9, 7, 6}, 3), new int[] {9, 7, 6, 3, 8});
        assertArrayEquals(rotation.solution(new int[] {}, 1), new int[] {});
        assertArrayEquals(rotation.solution(new int[] {5, -1000}, 1), new int[] {-1000, 5});
        assertArrayEquals(rotation.solution(new int[] {2, 3, 4, 5, 6, 7, 1}, 3), new int[] {6, 7, 1, 2, 3, 4, 5});
        assertArrayEquals(rotation.solution(new int[] {-9, 0}, 2), new int[] {-9, 0});
    }
}