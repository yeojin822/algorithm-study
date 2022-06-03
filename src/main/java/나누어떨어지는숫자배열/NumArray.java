package 나누어떨어지는숫자배열;

import java.util.TreeSet;

public class NumArray {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0){
                ts.add(arr[i]);
            }
        }

        if (ts.size() == 0){
            ts.add(-1);
        }

        answer = ts.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
