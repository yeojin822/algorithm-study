package 자릿수더하기;

public class PlaceSum {
    public int solution(int n) {
        int answer = 0;
        String[] strings =  String.valueOf(n).split("");

        for (int i = 0; i < strings.length; i++) {
          answer += Integer.parseInt(strings[i]);
        }


        return answer;
    }
}
