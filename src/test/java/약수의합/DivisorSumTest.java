package 약수의합;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DivisorSumTest {
    DivisorSum divisorSum = new DivisorSum();

    @Test
    void solution() {
        assertThat(divisorSum.solution(12)).isEqualTo(28);
        assertThat(divisorSum.solution(5)).isEqualTo(6);
    }
}
