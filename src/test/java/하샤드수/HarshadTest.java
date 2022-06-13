package 하샤드수;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HarshadTest {
    Harshad harshad = new Harshad();
    @Test
    void solution() {
        assertThat(harshad.solution(10)).isEqualTo(true);
        assertThat(harshad.solution(12)).isEqualTo(true);
        assertThat(harshad.solution(11)).isEqualTo(false);
        assertThat(harshad.solution(13)).isEqualTo(false);
    }
}
