import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Sashko on 8/23/16.
 */
public class Chapter04MaxCountersTest extends TestCase {


    private Chapter04MaxCounters obj = new Chapter04MaxCounters();

    @Test
    public void testSolution() throws Exception {
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, obj.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }
}