import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Sashko on 8/24/16.
 */
public class Chapter05GenomicRangeQueryTest extends TestCase {

    private Chapter05GenomicRangeQuery obj = new Chapter05GenomicRangeQuery();

    @Test
    public void test() {
        assertArrayEquals(new int[] {4, 2, 2}, obj.solution("TC", new int[] {0, 0, 1}, new int[] {0, 1, 1}));
        assertArrayEquals(new int[] {1, 1, 2}, obj.solution("AC", new int[] {0, 0, 1}, new int[] {0, 1, 1}));
        assertArrayEquals(new int[] {2, 4, 1}, obj.solution("CAGCCTA", new int[] {2, 5, 0}, new int[] {4, 5, 6}));
    }

}
