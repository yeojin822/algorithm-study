package 실패율;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FailTest {
    Fail fail = new Fail();
    @Test
    void solution() {
        assertThat(fail.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})).isEqualTo(new int[]{3,4,2,1,5});
        assertThat(fail.solution(4, new int[]{4,4,4,4,4})).isEqualTo(new int[]{4,1,2,3});
        assertThat(fail.solution(4, new int[]{1,1,1,1,1})).isEqualTo(new int[]{1,2,3,4});
        assertThat(fail.solution(3, new int[]{1,1,1,1,1})).isEqualTo(new int[]{1,2,3});

    }
}