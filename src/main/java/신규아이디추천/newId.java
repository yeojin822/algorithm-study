package 신규아이디추천;

public class newId {
    public String solution(String new_id) {
        //1단계 소문자 만들기
        String answer = new_id.toLowerCase();

        //2단계 소문자, 숫자, - _ .을 ^(제외) 하고 제거
        answer = answer.replaceAll("[^a-z\\d\\-_.]*", "");

        //3단계 .이 2개인걸 .으로 치환
        answer = answer.replaceAll("\\.{2,}", ".");

        //4단계 처음과 마지막 . 제거
        answer = answer.replaceAll("^[.]|[.]$", "");

        //문자열이 공백이면 a추가
        answer = answer.isEmpty() ? "a" : answer;

        // 문자열의 길이 16보다 크면 제거하고 마지막 .제거
        answer = answer.length() >= 16 ? answer.substring(0,15).replaceAll("[.]$", "") : answer;

        //문자열의 길이가 3보다 작으면 마지막 문자 반복
        while(answer.length() < 3) {
            answer += answer.charAt(answer.length()-1);
        }

        return answer;
    }
}
