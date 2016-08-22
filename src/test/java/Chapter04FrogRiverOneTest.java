import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Sashko on 8/21/16.
 */
public class Chapter04FrogRiverOneTest extends TestCase {

    private Chapter04FrogRiverOne obj = new Chapter04FrogRiverOne();

    @Test
    public void test() {
        assertEquals(6, obj.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }

}