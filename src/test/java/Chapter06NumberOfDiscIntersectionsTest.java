import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Sashko on 8/21/16.
 */
public class Chapter06NumberOfDiscIntersectionsTest extends TestCase {

    private Chapter06NumberOfDiscIntersections obj = new Chapter06NumberOfDiscIntersections();

    @Test
    public void test() {
        assertEquals(1, obj.solution(new int[] {1, 5}));
        assertEquals(3, obj.solution(new int[] {1, 5, 2}));
        assertEquals(11, obj.solution(new int[] {1, 5, 2, 1, 4, 0}));
        assertEquals(2, obj.solution(new int[] {1, 2147483647, 0}));
    }

}