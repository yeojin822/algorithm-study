package 두정수사이의합;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumSumTest {
    NumSum numSum = new NumSum();

    @Test
    void solution() {
        assertThat(numSum.solution(3,5)).isEqualTo(12);
        assertThat(numSum.solution(3,3)).isEqualTo(3);
        assertThat(numSum.solution(5,3)).isEqualTo(12);
    }
}
