package 음양더하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AddTest {
    Add add = new Add();

    @Test
    public void test(){
        assertThat(add.solution(new int[]{4, 7, 12}, new boolean[]{true,false,true})).isEqualTo(9);
        assertThat(add.solution(new int[]{1,2,3}, new boolean[]{false,false,true})).isEqualTo(0);
    }

}
