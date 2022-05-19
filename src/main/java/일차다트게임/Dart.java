package 일차다트게임;

import java.util.Arrays;

public class Dart {
    public int solution(String dartResult) {
        int answer = 0;
        int idx = 0;
        String[] arr = dartResult.split("");
        int[] board = new int[3];

        for (int i = 0; i < arr.length; i++) {
            // 문자열의 숫자가 10인지 체크
            if(arr[i].equals("1") && arr[i+1].equals("0")){
                arr[i+1] = "10";
                continue;
            }

            // 문자에 따라 제곱수 계산 후 보드에 추가
            if (arr[i].equals("S") || arr[i].equals("D") || arr[i].equals("T")) {
                int n = (arr[i].equals("S")) ? 1 : arr[i].equals("D") ? 2 : 3;
                board[idx] = (int) Math.pow(Integer.parseInt(arr[i - 1]), n);
                idx++;
            }

            // 특수 문자 처리, 이미 idx 증가시켜뒀으
            if (arr[i].equals("*")) {
                if (idx == 1) {
                     board[0] = board[0] * 2;
                }else {
                    board[idx-1] = board[idx-1] * 2;
                    board[idx-2] = board[idx-2] * 2;
                }
            }

            if(arr[i].equals("#")){
                board[idx-1] =  board[idx-1] * -1;
            }
        }

        //배열값을 다 더한 후 리턴
       answer = Arrays.stream(board).sum();

        return answer;

    }
}
