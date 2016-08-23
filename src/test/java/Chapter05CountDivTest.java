import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Sashko on 8/24/16.
 */
public class Chapter05CountDivTest extends TestCase {

    private Chapter05CountDiv obj = new Chapter05CountDiv();

    @Test
    public void test() {
        assertEquals(3, obj.solution(6, 11, 2));
        assertEquals(1, obj.solution(0, 0, 11));
        assertEquals(0, obj.solution(1, 1, 11));
        assertEquals(0, obj.solution(10, 10, 7));
        assertEquals(20, obj.solution(11, 345, 17));
    }

}