package 자연수뒤집어배열로만들기;

import java.util.ArrayList;

public class IntToArray {
    public int[] solution(long n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        while (n != 0) {
            list.add((int)(n % 10));
            n /= 10;
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
