package 약수의개수와덧셈;

public class Divisor {
    public int solution(int left, int right) {
        int answer = 0;

        while (left <= right) {
            int count = 0;
            for (int i = 1; i <= left; i++) {
                if (left % i == 0) count ++;
            }

            if(count % 2 == 0){
                answer += left;
            }else{
                answer -= left;
            }
            left++;
        }

        return answer;
    }
}
