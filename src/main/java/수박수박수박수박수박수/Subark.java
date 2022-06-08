package 수박수박수박수박수박수;

public class Subark {
    public String solution(int n) {
        String subark = "수박";
        String answer = "";

        answer = n % 2 == 0 ? subark.repeat(n/2) : subark.repeat(n/2) + "수";

        return answer;
    }
}


