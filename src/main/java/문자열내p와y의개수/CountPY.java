package 문자열내p와y의개수;

public class CountPY {
    boolean solution(String s) {
        boolean answer = true;

       s = s.toLowerCase();

       int y = s.length() -  s.replace("y", "").length();
       int p = s.length() -  s.replace("p", "").length();

       answer = y == p ? true : false;

        return answer;
    }
}
