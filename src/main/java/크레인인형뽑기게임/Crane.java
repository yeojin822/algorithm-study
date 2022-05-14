package 크레인인형뽑기게임;

import java.util.Stack;

public class Crane {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        // 스택을 이용하여 데이터를 쌓아 데이터를 비교할 에정
        Stack<Integer> stack = new Stack<>();

       for(int m = 0; m < moves.length; m++){
           if(moves[m] > 0){
              for(int b=0; b < board.length; b++) {
                  //꺼내할 배열 라인에서 0보다 큰값중 인형의 위치를 찾아서
                  if (board[b][moves[m] - 1] > 0) {
                      //스택에 아무것도 없을때
                      if (stack.isEmpty()) {
                          //인형을 넣어줌
                          stack.push(board[b][moves[m] - 1]);
                      }else{
                          //스택의 마지막 값이 새로들어갈 인형과 같을때
                          if (stack.peek() == board[b][moves[m]-1]) {
                              //인형을 꺼내고 터진 횟수 추가
                              stack.pop();
                              answer += 2;
                          } else {
                              //인형 새로 추가
                              stack.push(board[b][moves[m] - 1]);
                          }
                      }
                      //인형을 꺼내왔으니 0 만들어준다
                      board[b][moves[m] - 1] = 0;
                      break;
                  }
              }
           }
       }
        return answer;
    }
}
