import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

/**
 * Created by Sashko on 4/15/17.
 */
public class ExamBits {

    public static void main(String[] args) {
//        final int[] bits = {1, 1, 0, 1};
        final int[] bits = {1, 0, 0, 1, 1};
        final int number = toInt(bits);
        System.out.println(number);
        stream(toBits(number)).forEach(System.out::print);
        System.out.println();
    }

    private static int[] toBits(int number) {
//        number = -number;
        final List<Integer> result = new ArrayList<>();
        while (number != 0) {
            result.add(Math.abs(number % 2));
            number = Math.floorDiv(number, -2);
        }
        return result.stream().mapToInt(x -> x).toArray();
    }

    private static int toInt(final int[] bits) {
        int result = 0;
        for (int i = 0; i < bits.length; i++) {
            result += bits[i] * Math.pow(-2, i);
        }
        return result;
    }

}
