package 내적;

class DotProduct {
    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        int result = 0;
        int i = 0;
        if((0 < a.length && a.length <= 1000) && (0 < b.length && b.length <= 1000) ){
            for(i = 0; i < a.length; i++){
              result += a[i] * b[i];
            }
        }
         answer = result;
        return answer;
    }
}
