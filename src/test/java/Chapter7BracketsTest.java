import junit.framework.TestCase;

/**
 * Created by Sashko on 2/26/17.
 */
public class Chapter7BracketsTest extends TestCase {

    private Chapter7Brackets obj = new Chapter7Brackets();

    public void testSolution() throws Exception {
        assertEquals(1, obj.solution("[{()()}]"));
        assertEquals(0, obj.solution("[{()()}]))"));
        assertEquals(0, obj.solution("[({())}]"));
        assertEquals(1, obj.solution(""));
        assertEquals(0, obj.solution("[]{"));
    }

}