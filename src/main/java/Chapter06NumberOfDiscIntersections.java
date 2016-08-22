import java.util.Arrays;

/**
 * Created by Sashko on 8/21/16.
 */
public class Chapter06NumberOfDiscIntersections {

    public int solution(int[] a) {
        int result = 0;
        if (a.length == 2) {
            result = calculate(-a[0], a[0], 1, a[1], result);
            return result;
        }
        int[] lefts = new int[a.length];
//        int[] rights = new int[a.length];
        for (int center = 0; center < a.length; center++) {
            int tmp = center - a[center];
            lefts[center] = tmp;
//            rights[center] = -tmp;
        }
        Arrays.sort(lefts);
//        Arrays.sort(rights);
        for (int center = 0; center < a.length; center++) {
            int left = center - a[center];
            int right = center + a[center];
            int leftPosition = Arrays.binarySearch(lefts, left);
            int rightPosition = Arrays.binarySearch(lefts, right);
            result += rightPosition - leftPosition;
        }
        return result;
    }

    public int solutionSlow(int[] a) {
        int result = 0;
        if (a.length == 2) {
            result = calculate(-a[0], a[0], 1, a[1], result);
            return result;
        }
        for (int center1 = 0; center1 < a.length - 1; center1++) {
            int radius1 = a[center1];
            if (radius1 == Integer.MAX_VALUE) {
                result++;
                continue;
            }
            int left1 = center1 - radius1;
            int right1 = center1 + radius1;
            for (int center2 = center1 + 1; center2 < a.length; center2++) {
                result = calculate(left1, right1, center2, a[center2], result);
            }
        }
        return result;
    }

    private int calculate(int left1, int right1, int center2, int radius2, int result) {
        if (radius2 == Integer.MAX_VALUE) {
            return ++result;
        }
        int left2 = center2 - radius2;
        int right2 = center2 + radius2;
        if ((left1 <= left2 && left2 <= right1) || (left2 <= left1 && right1 <= right2)) {
            result++;
        }
        return result;
    }

}
