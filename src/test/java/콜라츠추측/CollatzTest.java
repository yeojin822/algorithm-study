package 콜라츠추측;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CollatzTest {
    Collatz collatz = new Collatz();

    @Test
    void solution() {
        assertThat(collatz.solution(6)).isEqualTo(8);
        assertThat(collatz.solution(16)).isEqualTo(4);
        assertThat(collatz.solution(626331)).isEqualTo(-1);
    }
}
