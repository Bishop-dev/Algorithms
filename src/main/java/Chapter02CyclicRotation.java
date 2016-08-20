/**
 * Created by Sashko on 8/20/16.
 */
public class Chapter02CyclicRotation {

    /**
     * A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.

     For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.

     Write a function:

     class Solution { public int[] solution(int[] A, int K); }
     that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

     For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

     Assume that:

     N and K are integers within the range [0..100];
     each element of array A is an integer within the range [−1,000..1,000].
     In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
     * @param a
     * @param k
     * @return
     */
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
