package 정수제곱근판별;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square = new Square();

    @Test
    void solution() {
        assertThat(square.solution(121)).isEqualTo(144);
        assertThat(square.solution(3)).isEqualTo(-1);
    }
}
