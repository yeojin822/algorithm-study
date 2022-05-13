package 폰켓몬;

import java.util.Arrays;

public class Phone {
    public int solution(int[] nums) {
        int answer = 0;

        //가질수 있는 폰켓몬 수를 구함
        int cnt = nums.length / 2;

        //  배열의 중복을 제거
        nums = Arrays.stream(nums).distinct().toArray();

        // 가질수 있는 수와 중복을 제거한 배열의 길이를 비교하여 리턴
        answer = (cnt >= nums.length) ? nums.length : cnt;


        return answer;
    }
}
