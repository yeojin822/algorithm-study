package 숫자문자열과영단어;

public class NumAndString {
    public int solution(String s) {
        int answer = 0;
        String[] stringNum = {"zero","one","two","three","four","five", "six","seven","eight","nine" };

            for (int i = 0; i < stringNum.length; i++) {
                //해당 문자열을 포함하고 있다면
                if (s.contains(stringNum[i])) {
                    //숫자로 변경
                   s =  s.replace(stringNum[i] ,Integer.toString(i));
                }
            }


            answer = Integer.parseInt(s);

        return answer;
    }
}
