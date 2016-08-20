import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sashko on 8/19/16.
 */
public class Chapter01Test {

    @Test
    public void test() {
        Chapter01 chapter01 = new Chapter01();
        assertEquals(chapter01.solution(1041), 5);
        assertEquals(chapter01.solution(5), 1);
        assertEquals(chapter01.solution(15), 0);
        assertEquals(chapter01.solution(2147483647), 0);
        assertEquals(chapter01.solution(6), 0);
        assertEquals(chapter01.solution(328), 2);
        assertEquals(chapter01.solution(1), 0);
        assertEquals(chapter01.solution(16), 0);
        assertEquals(chapter01.solution(1024), 0);
        assertEquals(chapter01.solution(51712), 2);
        assertEquals(chapter01.solution(20), 1);
        assertEquals(chapter01.solution(561892), 3);
    }
}
