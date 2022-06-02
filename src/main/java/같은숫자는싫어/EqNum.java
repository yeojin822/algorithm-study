package 같은숫자는싫어;

import java.util.ArrayList;
import java.util.Arrays;

public class EqNum {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            if(i+1 < arr.length && arr[i] == arr[i+1]){
                continue;
            }
            list.add(arr[i]);
        }

       answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
