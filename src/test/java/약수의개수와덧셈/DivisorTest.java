package 약수의개수와덧셈;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DivisorTest {
    Divisor divisor = new Divisor();

    @Test
    public void test(){
        assertThat(divisor.solution(13,17)).isEqualTo(43);
        assertThat(divisor.solution(24,27)).isEqualTo(52);
    }
}