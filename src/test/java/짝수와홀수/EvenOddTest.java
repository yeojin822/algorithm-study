package 짝수와홀수;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {
    EvenOdd evenOdd = new EvenOdd();

    @Test
    void solution() {
        assertThat(evenOdd.solution(3)).isEqualTo("Odd");
        assertThat(evenOdd.solution(4)).isEqualTo("Even");
    }
}
