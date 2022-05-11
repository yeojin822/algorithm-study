package 최소직사각형;

public class Rectangle {
    public int solution(int[][] sizes) {
        int answer = 0;

        for(int i = 0 ; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp =  sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        int w = sizes[0][0];
        int h = sizes[0][1];

        for (int j = 0 ; j < sizes.length; j ++){
            if( w < sizes[j][0]){
                w = sizes[j][0];
            }

            if( h < sizes[j][1]){
                h = sizes[j][1];
            }
        }

        answer = h  * w;

        return answer;
    }
}
