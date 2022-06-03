package 나누어떨어지는숫자배열;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumArrayTest {
    NumArray numArray = new NumArray();
    @Test
    void solution() {
        assertThat(numArray.solution(new int[]{5, 9, 7, 10}, 5)).isEqualTo(new int[]{5, 10});
        assertThat(numArray.solution(new int[]{2, 36, 1, 3}, 1)).isEqualTo(new int[]{1, 2, 3, 36});
        assertThat(numArray.solution(new int[]{3,2,6}, 10)).isEqualTo(new int[]{-1});
    }
}
