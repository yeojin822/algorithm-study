package 문자열내림차순으로배치하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {
    StringReverse stringReverse = new StringReverse();
    @Test
    void solution() {
        assertThat(stringReverse.solution("Zbcdefg")).isEqualTo("gfedcbZ");
    }
}