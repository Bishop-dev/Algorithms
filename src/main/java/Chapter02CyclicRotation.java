/**
 * Created by Sashko on 8/20/16.
 */
public class Chapter02CyclicRotation {
    public int[] solution(int[] a, int k) {
        if (a.length == 0 || k == 0) {
            return a;
        }
        if (a.length == 2 && k < a.length) {
            int tmp = a[1];
            a[1] = a[0];
            a[0] = tmp;
            return a;
        }
        if (a.length == k || k % a.length == 0) {
            return a;
        }
        while (k > a.length) {
            k -= a.length;
        }
        if (k == 0) {
            return a;
        }
        print(a);
        reverse(a, 0, a.length - 1);
        reverse(a, k, a.length - 1);
        reverse(a, 0, k - 1);
        print(a);
        return a;
    }

    private void reverse(int[] a, int start, int end) {
        if (end - start == 0) {
            return;
        }
        while (start < end) {
            int tmp = a[start];
            a[start] = a[end];
            a[end] = tmp;
            start++;
            end--;
        }
    }

    private void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("");
    }
}
