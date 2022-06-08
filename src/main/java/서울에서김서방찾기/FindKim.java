package 서울에서김서방찾기;

import java.util.Arrays;
import java.util.List;

public class FindKim {
    public String solution(String[] seoul) {
    String answer = "";
    List<String> findKim = Arrays.asList(seoul);

    answer = "김서방은 "+findKim.indexOf("Kim")+"에 있다";
    return answer;
    }
}
