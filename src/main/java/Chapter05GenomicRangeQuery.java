import java.util.Arrays;

/**
 * Created by Sashko on 8/24/16.
 */
public class Chapter05GenomicRangeQuery {

    /**
     *A DNA sequence can be represented as a string consisting of the letters A, C, G and T, which correspond to the types of successive nucleotides in the sequence. Each nucleotide has an impact factor, which is an integer. Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively. You are going to answer several queries of the form: What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?

     The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters. There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers. The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides contained in the DNA sequence between positions P[K] and Q[K] (inclusive).

     For example, consider string S = CAGCCTA and arrays P, Q such that:

     P[0] = 2    Q[0] = 4
     P[1] = 5    Q[1] = 5
     P[2] = 0    Q[2] = 6
     The answers to these M = 3 queries are as follows:

     The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors are 3 and 2 respectively, so the answer is 2.
     The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
     The part between positions 0 and 6 (the whole string) contains all nucleotides, in particular nucleotide A whose impact factor is 1, so the answer is 1.
     Write a function:

     class Solution { public int[] solution(String S, int[] P, int[] Q); }
     that, given a non-empty zero-indexed string S consisting of N characters and two non-empty zero-indexed arrays P and Q consisting of M integers, returns an array consisting of M integers specifying the consecutive answers to all queries.

     The sequence should be returned as:

     a Results structure (in C), or
     a vector of integers (in C++), or
     a Results record (in Pascal), or
     an array of integers (in any other programming language).
     For example, given the string S = CAGCCTA and arrays P, Q such that:

     P[0] = 2    Q[0] = 4
     P[1] = 5    Q[1] = 5
     P[2] = 0    Q[2] = 6
     the function should return the values [2, 4, 1], as explained above.

     Assume that:

     N is an integer within the range [1..100,000];
     M is an integer within the range [1..50,000];
     each element of arrays P, Q is an integer within the range [0..N − 1];
     P[K] ≤ Q[K], where 0 ≤ K < M;
     string S consists only of upper-case English letters A, C, G, T.
     Complexity:

     expected worst-case time complexity is O(N+M);
     expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
     Elements of input arrays can be modified.
     */

    public int[] solution(String s, int[] p, int[] q) {
        int[][] matrix = new int[3][s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            int a = 0, c = 0, g = 0;
            char ch = s.charAt(i);
            if (ch == 'A') {
                a = 1;
            } else if (ch == 'C') {
                c = 2;
            } else if (ch == 'G') {
                g = 3;
            }
            matrix[0][i + 1] = matrix[0][i] + a;
            matrix[1][i + 1] = matrix[1][i] + c;
            matrix[2][i + 1] = matrix[2][i] + g;
        }
        int[] result = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            int from = p[i];
            int to = q[i] + 1;
            if (matrix[0][to] - matrix[0][from] > 0) {
                result[i] = 1;
            } else if (matrix[1][to] - matrix[1][from] > 0) {
                result[i] = 2;
            } else if(matrix[2][to] - matrix[2][from] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }

        }
        return result;
    }

    public int[] solutionSlow(String s, int[] p, int[] q) {
        int[] result = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            String str = null;
            if (p[i] == q[i]) {
                str = s.charAt(p[i]) + "";
            } else {
                str = s.substring(p[i], q[i] + 1);
            }
            int min = Integer.MAX_VALUE;
            for (Character character: str.toCharArray()) {
                if (min == 1) {break;}
                String ch = "" + character;
                switch (ch) {
                    case "A": if (min > 1) { min = 1; } break;
                    case "C": if (min > 2) { min = 2; } break;
                    case "G": if (min > 3) { min = 3; } break;
                    case "T": if (min > 4) { min = 4; } break;
                }
            }
            result[i] = min;
        }
        return result;
    }

}
