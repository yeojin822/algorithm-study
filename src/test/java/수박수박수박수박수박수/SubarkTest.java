package 수박수박수박수박수박수;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SubarkTest {
    Subark subark = new Subark();

    @Test
    void solution() {
        assertThat(subark.solution(3)).isEqualTo("수박수");
        assertThat(subark.solution(4)).isEqualTo("수박수박");
    }
}
