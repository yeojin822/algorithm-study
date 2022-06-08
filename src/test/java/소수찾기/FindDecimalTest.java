package 소수찾기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindDecimalTest {
    FindDecimal findDecimal = new FindDecimal();

    @Test
    void solution() {
        assertThat(findDecimal.solution(10)).isEqualTo(4);
        assertThat(findDecimal.solution(5)).isEqualTo(3);
    }
}
