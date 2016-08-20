/**
 * Created by Sashko on 8/19/16.
 */
public class Chapter01 {

    public int solution(int n) {
        if (n < 0) {
            return 0;
        }
        String str = Integer.toBinaryString(n);
        int result = 0;
        int tmp = 0;
        for (int i = 0; i < str.length(); i++) {
            if ("0".equals(Character.toString(str.charAt(i)))) {
                tmp++;
                if (i == str.length() - 1){
                    tmp = 0;
                }
            } else {
                if (tmp >= result) {
                    result = tmp;
                }
                tmp = 0;
            }
        }
        return result;
    }

}
