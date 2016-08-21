import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Sashko on 8/21/16.
 */
public class Chapter04MissingIntegerTest extends TestCase {

    private Chapter04MissingInteger obj = new Chapter04MissingInteger();

    @Test
    public void test() {
        assertEquals(1, obj.solution(new int[] {4, 5, 6, 2}));
        assertEquals(5, obj.solution(new int[] {1, 3, 6, 4, 1, 2}));
        assertEquals(2, obj.solution(new int[] {1}));
    }

}