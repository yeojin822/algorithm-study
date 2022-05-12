package 소수만들기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DecimalTest {
    Decimal decimal = new Decimal();

    @Test
    void solution() {
       assertThat(decimal.solution(new int[]{1,2,3,4})).isEqualTo(1);
       assertThat(decimal.solution(new int[]{1,2,7,6,4})).isEqualTo(4);
    }
}
