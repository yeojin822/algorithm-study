package 완주하지못한선수;

import java.util.HashMap;

public class Unfinished {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> player = new HashMap<>();


        for (String p : participant)
            player.put(p, player.getOrDefault(p, 0)+1);
            //map에 p의 값이 있다면 p값을 아니면 0을 셋팅해서 1을 더한다
        for (String p : completion)
            player.put(p, player.get(p) -1 );
            //완주한 사람을 map에서 가져와서 -1

        for (String key : player.keySet()) {
            if (player.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
