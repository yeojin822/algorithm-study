package 최소직사각형;

public class Rectangle {
    public int solution(int[][] sizes) {
        int answer = 0;

        for(int i = 0 ; i < sizes.length; i++){
            //size[i]을 꺼내 두수를 비교하여 큰값을 앞으로 이동
            if(sizes[i][0] < sizes[i][1]){
                int temp =  sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        // 초기값 설정
        int w = sizes[0][0];
        int h = sizes[0][1];

        for (int j = 0 ; j < sizes.length; j ++){
            //  배열의 0번라인 최대값 찾기
            if( w < sizes[j][0]){
                w = sizes[j][0];
            }
            //  배열의 1번라인 최대값 찾기
            if( h < sizes[j][1]){
                h = sizes[j][1];
            }
        }

        answer = h  * w;

        return answer;
    }
}
