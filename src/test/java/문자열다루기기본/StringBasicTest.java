package 문자열다루기기본;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringBasicTest {
    StringBasic stringBasic = new StringBasic();

    @Test
    void solution() {
        assertThat(stringBasic.solution("a234")).isEqualTo(false);
        assertThat(stringBasic.solution("1234")).isEqualTo(true);
    }
}
