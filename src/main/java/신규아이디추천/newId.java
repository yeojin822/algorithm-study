package 신규아이디추천;

public class newId {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z\\d\\-_.]*", "");
        answer = answer.replaceAll("\\.{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");
        answer = answer.isEmpty() ? "a" : answer;
        answer = answer.length() >= 16 ? answer.substring(0,15).replaceAll("[.]$", "") : answer;
        while(answer.length() < 3) {
            answer += answer.charAt(answer.length()-1);
        }

        return answer;
    }
}
