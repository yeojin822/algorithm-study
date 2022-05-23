package 로또의최고순위와최저순위;

import java.util.Arrays;

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        //등수체크를 위한 배열
        Integer[] result = {6,5,4,3,2,1};
        int[] answer = new int[2];
        int zero = 0;
        int win = 0;

        Arrays.sort(lottos);
        Arrays.sort(win_nums);


        for (int i = 0; i < lottos.length; i++) {
            //0인 개수 체크
            if(lottos[i] == 0){
                zero++;
            }else{
                //맞는 숫자 체크
                for (int j = 0; j < win_nums.length; j++) {
                    if(win_nums[j] == lottos[i]){
                        win++;
                    }
                }
            }
        }

        //최고 등수 체크
        for (int i = 1; i <win_nums.length; i++) {
            if(win+zero >= 6){
                answer[0] = 1;
                break;
            }
            if(win+zero == result[i]){
                answer[0] = (i+1);
                break;
            }
            if(win+zero < 1){
                answer[0] = 6;
                break;
            }
        }
        //최저 등수 체크
        answer[1] = win == 0 ? 6 : Arrays.asList(result).indexOf(win)+1;


        return answer;
    }
}
