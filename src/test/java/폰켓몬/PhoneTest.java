package 폰켓몬;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {
        Phone phone = new Phone();
    @Test
    void solution() {
        assertThat(phone.solution(new int[]{3,1,2,3})).isEqualTo(2);
        assertThat(phone.solution(new int[]{3,3,3,2,2,4})).isEqualTo(3);
        assertThat(phone.solution(new int[]{3,3,3,2,2,2})).isEqualTo(2);
    }
}
