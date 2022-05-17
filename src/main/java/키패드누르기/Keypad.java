package 키패드누르기;

import java.util.Arrays;
import java.util.Locale;

public class Keypad {
    public String solution(int[] numbers, String hand) {
        String[] left = {"1", "4", "7", "*"};
        String[] center = {"2", "5", "8", "0"};
        String[] right = {"3", "6", "9", "#"};
        //초기 손가락 위치
        int l = 3;
        int r = 3;

        //가운데 위치
        int rc = 0;
        int lc = 0;
        String answer = "";


        for (int i = 0; i < numbers.length; i++) {
            //왼쪽이면
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                l = Arrays.asList(left).indexOf(Integer.toString(numbers[i]));
                lc = 0;
             //오른쪽이면
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                r = Arrays.asList(right).indexOf(Integer.toString(numbers[i]));
                rc = 0;
            } else {
                //가운데일 경우 해당인덱스를 찾아서
                int s = Arrays.asList(center).indexOf(Integer.toString(numbers[i]));

                //왼쪽 또는 오른쪽 인덱스와 비교하여 가까운쪽으로 선택 후 가운데로 이동 시 인덱스 -1
                if( Math.abs(s - l) + lc >  Math.abs(s - r) + rc) {
                    answer += "R";
                    rc = -1;
                    r = s;
                }
                else if( Math.abs(s - l) + lc <  Math.abs(s - r) + rc) {
                    answer += "L";
                    lc = -1;
                    l = s;
                }else if(Math.abs(s - l) + lc ==  Math.abs(s - r) + rc){
                    if (hand.equals("left")) {
                        answer += "L";
                        lc = -1;
                        l = s;
                    } else {
                        answer += "R";
                        rc = -1;
                        r = s;
                    }
                }
            }

        }

        return answer;
    }
}
