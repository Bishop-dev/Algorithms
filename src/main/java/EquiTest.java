/**
 * Created by Sashko on 4/16/17.
 */
public class EquiTest {

    public int solution(int[] a) {
        if (a.length == 1) {
            return 0;
        }
        long totalAmount = 0;
        for (int i = 0; i < a.length; i++) {
            totalAmount += (long) a[i];
        }
        long firstAmount = 0;
        for (int i = 1; i < a.length; i++) {

            totalAmount -= (long) a[(i - 1 == -1 ? 0 : i - 1)];
            if (firstAmount == totalAmount) {
                return i-1;
            }
            firstAmount += (long) a[i-1];
        }
        if(firstAmount==0)
            return a.length-1;
        return -1;
    }

}
