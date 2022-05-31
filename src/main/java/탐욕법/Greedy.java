package 탐욕법;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Greedy {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        //배열 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        //배열을 리스트로 바꿔서
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> rsList = Arrays.stream(reserve).boxed().collect(Collectors.toList());

        for (int i = 0; i < lost.length; i++) {
            //잃어버린사람이 빌려줄수 없음, 중복 제거
            if(rsList.contains(lost[i])){
                lostList.remove(lostList.indexOf(lost[i]));
                rsList.remove(rsList.indexOf(lost[i]));
                answer++;
            }
        }

            //발려줄수 있는 사람 찾기
        for (int i = 0; i < lostList.size(); i++) {
            if(rsList.contains(lostList.get(i)-1)){
                rsList.remove(rsList.indexOf(lostList.get(i)-1));
                answer++;
                continue;
            }

            if(rsList.contains(lostList.get(i)+1)){
                rsList.remove(rsList.indexOf(lostList.get(i)+1));
               answer++;
               continue;
           }
        }



        return answer;
    }
}
