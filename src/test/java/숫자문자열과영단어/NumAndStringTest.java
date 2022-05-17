package 숫자문자열과영단어;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumAndStringTest {
    NumAndString numAndString = new NumAndString();
    @Test
    void solution() {
        assertThat(numAndString.solution("one4seveneight")).isEqualTo(1478);
        assertThat(numAndString.solution("23four5six7")).isEqualTo(234567);
        assertThat(numAndString.solution("2three45sixseven")).isEqualTo(234567);
        assertThat(numAndString.solution("123")).isEqualTo(123);
    }
}
