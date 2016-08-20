import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sashko on 8/20/16.
 */
public class Chapter02OddOccurrencesInArray {

    public int solution(int[] a) {
        if (a.length == 1) {
            return a[0];
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                continue;
            }
            int number = a[i];
            if (set.contains(number)) {
                set.remove(number);
                a[i] = 0;
            } else {
                set.add(number);
            }
        }
        return set.iterator().next();
    }

}
