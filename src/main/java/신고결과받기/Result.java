package 신고결과받기;

import java.util.*;

public class Result {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        //유저와 신고목록으로 객체생성
        Map<String, ArrayList<String>> map = new HashMap<>();
        //신고계정과 득표수로 객체생성
        Map<String, Integer> vote = new HashMap<>();
        // 중복제거하여 같은계정 1번만 신고
        report = Arrays.stream(report).distinct().toArray(String[]::new);

        for (int j = 0; j < report.length; j++) {
            String voter = report[j].split(" ")[0]; // 유저
            String candidate = report[j].split(" ")[1]; // 신고 계정

            if (map.get(voter) == null) {
                map.put(voter, new ArrayList<>());
            }
            //유저 신고목록에 신고계정이 없으면 추가
            if (!map.get(voter).contains(candidate)) {
                map.get(voter).add(candidate);
            }
            //신고계정 득표수
            if (vote.get(candidate) != null) {
                vote.put(candidate, vote.get(candidate) + 1);
            } else {
                vote.put(candidate, 1);
            }
        }

        for (String item : vote.keySet()) {
            // 신고목록에 k보다 큰값의 득표를 받은 계정 1 로 변경
            if (Integer.parseInt(String.valueOf(vote.get(item))) >= k) {
                for (String array : map.keySet()) {
                    if (map.get(array).contains(item)) {
                        map.get(array).set(map.get(array).indexOf(item), "1");
                    }
                }
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            if (map.get(id_list[i]) != null) {
                //목록에서 1의 개수를 찾아 배열에 담아 리턴
                answer[i] = Collections.frequency(map.get(id_list[i]), "1");
            }
        }
        return answer;
    }
}
