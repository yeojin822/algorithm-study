package 이상한문자만들기;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MakeString {
    public String solution(String s) {
        String answer = "";

        String[] strings = s.split(" ",-1);

        for (int i = 0; i < strings.length; i++) {
            String[] str = strings[i].split("");
            for (int j = 0; j < str.length; j++) {
                if(j % 2 == 0){
                    str[j] = str[j].toUpperCase();
                }else{
                    str[j] = str[j].toLowerCase();
                }
            }
            strings[i] = Arrays.stream(str).collect(Collectors.joining());
        }

        answer = String.join(" ",strings);
        return answer;
    }
}
