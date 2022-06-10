package 제일작은수제거하기;

public class RemoveNum {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int idx = 0;


        if(arr.length == 1 ) return new int[]{-1};

        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }

         for (int i = 0; i < arr.length; i++) {
            if(min != arr[i]){
                answer[idx] = arr[i];
                idx++;
            }
        }

        return answer;
    }
}
