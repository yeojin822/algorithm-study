package 두개뽑아서더하기;


// 프로그래머스 월간 코드 챌린지 시즌1 두개 뽑아서 더하기
import java.util.Arrays;
import java.util.HashSet;

class Sum {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Integer[] temp = {};
        HashSet<Integer> list = new HashSet<>();
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                if(i == j){
                    continue;
                }
                sum = numbers[i] + numbers[j];
                list.add(sum);
            }
        }

        temp = list.toArray(new Integer[0]);

        //Integer 요소를 int형으로 unboxing
        answer = Arrays.stream(temp).mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
