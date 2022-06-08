package 문자열을정수로바꾸기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringToIntTest {
    StringToInt stringToInt = new StringToInt();

    @Test
    void solution() {
        assertThat(stringToInt.solution("1234")).isEqualTo(1234);
        assertThat(stringToInt.solution("-1234")).isEqualTo(-1234);
    }
}
