package 부족한금액계산하기;

public class Cal {
    public long solution(int price, int money, int count) {
        long answer = 0;
       answer =  factorial(count,price) - money;

       if(answer < 0){
           return 0;
       }
        return answer;
    }
    // 재귀함수 이용 팩토리얼 함수 만들어서 리턴
    public static long factorial(int N, int price) { ;
        if(N <= 1) return N * price;
        return (N * price) + factorial(N - 1, price);
    }
}
