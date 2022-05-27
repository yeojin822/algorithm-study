package K번째수;

import java.util.Arrays;

public class NumK {
    public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

        for(int i = 0; i<commands.length;i++) {
            // 배열을 잘라서 복사
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            // 정렬
            Arrays.sort(temp);
            //N번째 숫자 가져오기
            answer[i] = temp[commands[i][2]-1];
        }

    return answer;

    }
}
