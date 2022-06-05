package 문자열내맘대로정렬하기;

import java.util.Arrays;

public class ArraySort {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        for (int i = 0; i<strings.length -1; i++) {
                for (int j = i+1; j <strings.length; j++) {
                    if (strings[i].charAt(n) > strings[j].charAt(n)) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }

                }
        }

        for (int i = 0; i<strings.length -1; i++) {
            for (int j = i+1; j <strings.length; j++) {
                if (strings[i].toCharArray()[n] == strings[j].toCharArray()[n]) {
                    Arrays.sort(strings,i,j+1);
                }

            }
        }

        answer = strings;

        return answer;
    }
}
