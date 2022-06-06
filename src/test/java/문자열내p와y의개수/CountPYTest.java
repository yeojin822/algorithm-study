package 문자열내p와y의개수;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CountPYTest {
    CountPY countPY = new CountPY();

    @Test
    void solution() {
        assertThat(countPY.solution("pPoooyY")).isEqualTo(true);
        assertThat(countPY.solution("Pyy")).isEqualTo(false);
    }
}