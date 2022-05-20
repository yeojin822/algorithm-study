package 실패율;

import java.util.*;

public class Fail {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        int idx = 0;
        int user = stages.length;

        Map<Integer, Double> result = new HashMap<>();

        //배열을 정렬하고
        Arrays.sort(stages);


        for (int i = 1; i < N + 1; i++) {
            int cnt = 0;
            //같은 숫자라면 카운트 증가
            for (int j = idx; j < stages.length; j++) {
                if (i == stages[j]) {
                    cnt++;
                } else {
                    //아니라면 스테이지가 올라간거니깐 인덱스 저장해주고 반복 종료
                    idx = j;
                    break;
                }
            }
            if (user > 0) {
                //실패율과 인덱스를 맵에 저장
                result.put(i, ((double) cnt / (double) user));
                user -= cnt;
            } else {
                //실패율이 0일 경우 저장
                result.put(i, (double) 0);
            }

        }


        List<Integer> listKeySet = new ArrayList<>(result.keySet());

        // collections sort를 통해 value 값으로 내림차순 정렬
        Collections.sort(listKeySet, (value1, value2) -> (result.get(value2).compareTo(result.get(value1))));
        // 정렬한 리스트의 키값을 배열로 만들어서 리턴
        answer = listKeySet.stream().mapToInt(Integer::intValue).toArray();


        return answer;
    }

}
