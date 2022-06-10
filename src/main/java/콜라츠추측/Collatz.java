package 콜라츠추측;

public class Collatz {
    public int solution(long num) {
    int answer = 0;
    int cnt = 0;

    if(num == 1) return 0;

    while (num > 1 && cnt < 500){
        if(num % 2 == 0){
            num = num/2;
        }else{
            num = num*3+1;
        }
        cnt++;
    }

    answer = cnt == 500 ? -1 : cnt;

    return answer;
    }
}
