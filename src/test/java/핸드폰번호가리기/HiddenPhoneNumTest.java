package 핸드폰번호가리기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HiddenPhoneNumTest {
    HiddenPhoneNum hiddenPhoneNum = new HiddenPhoneNum();

    @Test
    void solution() {
        assertThat(hiddenPhoneNum.solution("01033334444")).isEqualTo("*******4444");
        assertThat(hiddenPhoneNum.solution("027778888")).isEqualTo("*****8888");
    }
}
