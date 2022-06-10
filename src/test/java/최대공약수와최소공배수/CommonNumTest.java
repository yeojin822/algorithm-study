package 최대공약수와최소공배수;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CommonNumTest {
    CommonNum commonNum = new CommonNum();

    @Test
    void solution() {
        assertThat(commonNum.solution(3,12)).isEqualTo(new int[]{3, 12});
        assertThat(commonNum.solution(2,5)).isEqualTo(new int[]{1, 10});
    }
}
