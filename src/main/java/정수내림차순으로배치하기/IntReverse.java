package 정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class IntReverse {
    public long solution(long n) {
        String len = ""+n;
        long answer = 0;
        String[] array = new String[len.length()];
        int idx = 0;

        while (n != 0) {
            array[idx] = String.valueOf(n % 10);
            n /= 10;
            idx++;
        }
        Arrays.sort(array,Collections.reverseOrder());

        answer = Long.parseLong(Arrays.stream(array).collect(Collectors.joining()));

        return answer;
    }
}
