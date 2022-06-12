package 평균구하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AverageTest {
    Average average = new Average();

    @Test
    void solution() {
        assertThat(average.solution(new int[]{1,2,3,4})).isEqualTo(2.5);
        assertThat(average.solution(new int[]{5,5})).isEqualTo(5);
    }
}