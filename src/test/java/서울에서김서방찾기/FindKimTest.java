package 서울에서김서방찾기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindKimTest {
    FindKim findKim = new FindKim();
    @Test
    void solution() {
        assertThat(findKim.solution(new String[]{"Jane", "Kim"})).isEqualTo("김서방은 1에 있다");
    }
}
