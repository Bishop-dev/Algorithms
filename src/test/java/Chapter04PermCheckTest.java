import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Sashko on 8/21/16.
 */
public class Chapter04PermCheckTest extends TestCase {

    private Chapter04PermCheck check =new Chapter04PermCheck();

    @Test
    public void test() {
        assertEquals(1, check.solution(new int[] {1}));
        assertEquals(0, check.solution(new int[] {2}));
        assertEquals(0, check.solution(new int[] {3, 2}));
        assertEquals(0, check.solution(new int[] {4, 1, 3}));
        assertEquals(1, check.solution(new int[] {4, 1, 3, 2}));
    }

}