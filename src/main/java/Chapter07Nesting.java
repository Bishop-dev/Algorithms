/**
 * Created by Sashko on 3/25/17.
 */
public class Chapter07Nesting {

    /**
     * A string S consisting of N characters is called properly nested if:

     S is empty;
     S has the form "(U)" where U is a properly nested string;
     S has the form "VW" where V and W are properly nested strings.
     For example, string "(()(())())" is properly nested but string "())" isn't.

     Write a function:

     class Solution { public int solution(String S); }
     that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.

     For example, given S = "(()(())())", the function should return 1 and given S = "())", the function should return 0, as explained above.

     Assume that:

     N is an integer within the range [0..1,000,000];
     string S consists only of the characters "(" and/or ")".
     Complexity:

     expected worst-case time complexity is O(N);
     expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
     */

    public int solution(String s) {
        if (s == null || s.length() % 2 == 1) {
            return 0;
        }
        if (s.length() == 0) {
            return 1;
        }
        final String firstChar = ((Character) s.charAt(0)).toString();
        if (")".equals(firstChar)) {
            return 0;
        }
        int openCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            final String ch = ((Character) s.charAt(i)).toString();
            if (ch.equals("(")) {
                openCounter++;
            } else {
                if (openCounter == 0) {
                    return 0;
                }
                openCounter--;
            }
        }
        return openCounter == 0 ? 1 : 0;
    }

}
