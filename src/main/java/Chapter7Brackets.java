import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by Sashko on 2/26/17.
 */
public class Chapter7Brackets {

    /**
     * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

     S is empty;
     S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
     S has the form "VW" where V and W are properly nested strings.
     For example, the string "{[()()]}" is properly nested but "([)()]" is not.

     Write a function:

     class Solution { public int solution(String S); }
     that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

     For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

     Assume that:

     N is an integer within the range [0..200,000];
     string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
     Complexity:

     expected worst-case time complexity is O(N);
     expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
     */

    public int solution(String s) {
        if (s == null || s.length() % 2 == 1) {
            return 0;
        }
        final Stack<String> stack = new Stack();
        final Set<String> open = new HashSet<String>(){{
            add("(");
            add("[");
            add("{");
        }};
        for (final Character c: s.toCharArray()) {
            final String symbol = c.toString();
            if (open.contains(symbol)) {
                stack.push(symbol);
            } else {
                if (stack.empty()) {
                    return 0;
                }
                final String toCompare = stack.pop();
                if (toCompare.equals("(") && symbol.equals(")") ||
                        toCompare.equals("[") && symbol.equals("]") ||
                        toCompare.equals("{") && symbol.equals("}")) {
                    continue;
                } else {
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

}
