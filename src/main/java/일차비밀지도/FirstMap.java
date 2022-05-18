package 일차비밀지도;

public class FirstMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0 ; i < n ; i++){
            String empty = " ";
            // 같은 index에 배열값을 비트연산 하여 2진법으로 바꿈
            String map = Integer.toBinaryString( arr1[i] | arr2[i]);
            
            //n의 길이의 차이만큼 공백 생성
            map = empty.repeat(n-map.length()) + map;
            
            // 문자로 치환
            map = map.replaceAll("1","#");
            map = map.replaceAll("0"," ");
            answer[i] = map;
        }
        return answer;
    }
}
