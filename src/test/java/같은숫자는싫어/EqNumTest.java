package 같은숫자는싫어;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EqNumTest {
    EqNum eqNum = new EqNum();
    @Test
    void solution() {
        assertThat(eqNum.solution(new int[]{1,1,3,3,0,1,1})).isEqualTo(new int[]{1,3,0,1});
        assertThat(eqNum.solution(new int[]{4,4,4,3,3})).isEqualTo(new int[]{4,3});
    }
}
