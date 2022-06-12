package 평균구하기;

import java.util.Arrays;

public class Average {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = Arrays.stream(arr).sum();

        answer = sum/arr.length;
        return answer;
    }
}
