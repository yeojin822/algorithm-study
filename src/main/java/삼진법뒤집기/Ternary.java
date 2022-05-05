package 삼진법뒤집기;

import java.util.ArrayList;

public class Ternary {
    public int solution(int n) {
        int answer = 0;
        ArrayList<String> array = new ArrayList<>();

        while(n > 0){
           array.add(Integer.toString(n%3));
           n /= 3;
        }

        String str = "";
        for (String item : array) {
            str += item;
        }

        answer = Integer.parseInt(str, 3);

        return answer;
    }
}
