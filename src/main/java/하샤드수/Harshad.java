package 하샤드수;

public class Harshad {
        public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int sum = 0;

        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }

       answer =  num % sum == 0 ? true : false;

        return answer;
    }
}
