import junit.framework.TestCase;

/**
 * Created by Sashko on 3/25/17.
 */
public class Chapter07NestingTest extends TestCase {

    private Chapter07Nesting obj = new Chapter07Nesting();

    public void testSolution() throws Exception {
        assertEquals(1, obj.solution("(()(())())"));
        assertEquals(0, obj.solution("())"));
        assertEquals(0, obj.solution(")())"));
        assertEquals(0, obj.solution("(())(("));
        assertEquals(0, obj.solution("(())("));
    }

}