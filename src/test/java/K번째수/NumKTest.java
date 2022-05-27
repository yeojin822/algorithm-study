package K번째수;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class NumKTest {
    NumK numK = new NumK();

    @Test
    void solution() {
    assertThat(numK.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3},{4, 4, 1}, {1, 7, 3}})).isEqualTo(new int[]{5, 6, 3});
    }

}
