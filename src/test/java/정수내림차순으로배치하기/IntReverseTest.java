package 정수내림차순으로배치하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IntReverseTest {
    IntReverse intReverse = new IntReverse();

    @Test
    void solution() {
        assertThat(intReverse.solution(118372)).isEqualTo(873211);
    }
}
