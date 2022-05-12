package 예산;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer =  d.length;

        //배열을 다 더해서 예산보다 작거나 같으면 리턴
        if (Arrays.stream(d).sum() <= budget) {
            return answer ;
        } else {
            //배열 정렬
            Arrays.sort(d);

            //예산과 배열값의 차이를 구해서
            int dif = Arrays.stream(d).sum() - budget;

            //가장 큰값을 빼고 다시 비교
            for(int i = d.length -1; i >= 0 ; i--){
              if(dif > 0){
                  dif -= d[i];
                  answer--;
              } else{
                  break;
              }
            }
        }
        return answer;
    }
}
