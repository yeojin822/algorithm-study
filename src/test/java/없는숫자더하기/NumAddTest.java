package 없는숫자더하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumAddTest {
    NumAdd numAdd = new NumAdd();

    @Test
    public void test(){
        assertThat(numAdd.solution(new int[]{1,2,3,4,6,7,8,0})).isEqualTo(14);
        assertThat(numAdd.solution(new int[]{5,8,4,0,6,7,9})).isEqualTo(6);
    }

}