package 문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StringReverse {
    public String solution(String s) {
        String answer = "";
        String[] strings = s.split("");

        Collections.sort(Arrays.asList(strings), Collections.reverseOrder());
        answer = Arrays.stream(strings).collect(Collectors.joining());

        return answer;
    }
}
