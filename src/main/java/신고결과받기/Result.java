package 신고결과받기;

import java.util.*;

public class Result {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, ArrayList<String>> map = new HashMap<>();
        Map<String, Integer> vote = new HashMap<>();
        boolean mail = false;
        report = Arrays.stream(report).distinct().toArray(String[]::new);

        ArrayList<String> list = new ArrayList<>();
        for (int j = 0; j < report.length; j++) {
            list.add(report[j].split(" ")[1]);
            map.put(report[j].split(" ")[0], list);

        if(vote.get(report[j].split(" ")[1]) != null){
                vote.put(report[j].split(" ")[1], vote.get(report[j].split(" ")[1])+1);
            }else{
                vote.put(report[j].split(" ")[1], 1);
            }
        }

        for (String item :vote.keySet()) {
            if(Integer.parseInt(String.valueOf(vote.get(item))) >= k ){
                mail = true;
                for (String array :map.keySet()) {
                    if(map.get(array).contains(item)) {
                        map.get(array).set(map.get(array).indexOf(item), "1");
                    }
                }
            };
        }

        if(mail) {
            for (int i = 0; i < id_list.length; i++) {
                if(map.get(id_list[i]) != null) {
                    answer[i] = Collections.frequency(map.get(id_list[i]), "1");
                }
            }
        }
        return answer;
    }
}
