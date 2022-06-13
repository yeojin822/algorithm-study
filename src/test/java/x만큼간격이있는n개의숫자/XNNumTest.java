package x만큼간격이있는n개의숫자;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class XNNumTest {
    XNNum xnNum = new XNNum();

    @Test
    void solution() {
        assertThat(xnNum.solution(2,5)).isEqualTo(new long[]{2,4,6,8,10});
        assertThat(xnNum.solution(4,3)).isEqualTo(new long[]{4,8,12});
        assertThat(xnNum.solution(-4,2)).isEqualTo(new long[]{-4, -8});
    }
}
