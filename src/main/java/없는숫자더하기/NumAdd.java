
package 없는숫자더하기;

import java.util.Arrays;

public class NumAdd {
    public int solution(int[] numbers) {
        int answer = 45 - Arrays.stream(numbers).sum();
        /* 0~9 까지 더한 수에서 파라미터로 받은 배열을 stream을 사용하여 배열의 합을 구해 뺌 */
        return answer;
    }
}
