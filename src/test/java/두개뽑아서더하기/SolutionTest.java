package 두개뽑아서더하기;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test(){
        assertArrayEquals(solution.solution(new int[]{2,1,3,4,1}), new int[]{2,3,4,5,6,7});
        assertArrayEquals(solution.solution(new int[]{5,0,2,7}), new int[]{2,5,7,9,12});
    }

}
