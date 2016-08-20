import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Sashko on 8/20/16.
 */
public class Chapter02OddOccurrencesInArrayTest extends TestCase {

    private Chapter02OddOccurrencesInArray obj = new Chapter02OddOccurrencesInArray();

    @Test
    public void test() {
        assertEquals(7, obj.solution(new int[] {7}));
        assertEquals(7, obj.solution(new int[] {1, 3, 7, 3, 1}));
        assertEquals(7, obj.solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
    }

}