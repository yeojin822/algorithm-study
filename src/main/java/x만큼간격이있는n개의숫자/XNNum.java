package x만큼간격이있는n개의숫자;

public class XNNum {
    public long[] solution(int x, int n) {
    long[] answer = new long[n];
    long iter = 1;
    int idx = 0;

    while(iter <= n){
        answer[idx] = (long)x * iter;
        idx++;
        iter++;
    }


    return answer;
}
}
