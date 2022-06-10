package 제일작은수제거하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RemoveNumTest {
    RemoveNum removeNum = new RemoveNum();

    @Test
    void solution() {
        assertThat(removeNum.solution(new int[]{4,3,2,1})).isEqualTo(new int[]{4,3,2});
        assertThat(removeNum.solution(new int[]{10})).isEqualTo(new int[]{-1});
    }
}
