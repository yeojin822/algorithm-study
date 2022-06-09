package 자연수뒤집어배열로만들기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IntToArrayTest {
    IntToArray intToArray = new IntToArray();

    @Test
    void solution() {
        assertThat(intToArray.solution(12345)).isEqualTo(new int[]{5,4,3,2,1});
    }
}
