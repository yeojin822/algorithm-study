package 문자열다루기기본;

public class StringBasic {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6){
            s = s.replaceAll("[\\d]", "");
            answer = s.length() > 0 ? false : true;
        }else{
            answer = false;
        }


        return answer;
    }
}
