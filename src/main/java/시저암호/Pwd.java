package 시저암호;

public class Pwd {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i);

            System.out.println(num);
            if((num > 64 && num < 91 && num+n < 91) || (num > 96 && num < 123 && num+n < 123)){
                answer += (char)(s.charAt(i)+n);
            }
            else if(num == 32){
                answer += s.charAt(i);
            }
            else {
                answer += (char)(s.charAt(i)+n-26);
            }

        }

        return answer;
    }
}
