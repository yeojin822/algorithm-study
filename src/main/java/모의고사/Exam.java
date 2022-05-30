package 모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] result = new int[3];
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int maxIdx = 0;

        for (int i = 0; i <answers.length ; i++) {

            if (answers[i] == one[i % one.length]){
                result[0]++;
            }

            if (answers[i] == two[i % two.length]){
                result[1]++;
            }

            if (answers[i] == three[i % three.length]){
                result[2]++;
            }
        }


        for (int i = 0; i < result.length ; i++) {
            if(result[maxIdx] < result[i]){
                maxIdx = i;
            }
        }

        for (int i = 0; i < result.length; i++) {
            if(result[maxIdx] == result[i]){
                answer.add(i+1);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
