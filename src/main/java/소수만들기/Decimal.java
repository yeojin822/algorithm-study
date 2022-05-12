package 소수만들기;

public class Decimal {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0;

        for (int x = 0; x < nums.length; x++) {
            // 첫번째 수 x일때
            for (int y = 0; y < nums.length; y++) {
                //첫번째와 두번째가 같으면 반복 종료.
                if (x == y) {
                    break;
                } else {
                    // 두번째 수 y일때
                    for (int z = 0; z < nums.length; z++) {
                        //첫번째 또는 두번째와 같으면 반복 종료.
                        if (y == z || x == z) {
                            break;
                        } else {
                            //세개의 다른 수를 더한다.
                            int sum = nums[x] + nums[y] + nums[z];
                            for (int i = 2; i < sum; i++) {
                                if (sum % i == 0) {
                                    // 소수가 아니면 반복 종료
                                    break;
                                }else{
                                    if(i + 1 == sum){
                                        // 자기자신과 나누는 수가 같다면 소수이므로 count 증가
                                        System.out.printf("[%d,%d,%d]를 이용해서 %d을 만들 수 있습니다.%n",nums[x],nums[y],nums[z],sum);
                                        count++;
                                    }
                                    // 아니라면 반복
                                }
                            }
                            answer = count;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
