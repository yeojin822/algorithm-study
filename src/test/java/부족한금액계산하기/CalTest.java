package 부족한금액계산하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalTest {
    Cal cal = new Cal();

    @Test
    public void test(){
        assertThat(cal.solution(3,20,4)).isEqualTo(10);
    }

}
