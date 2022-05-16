package 키패드누르기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class KeypadTest {
    Keypad keypad = new Keypad();
    @Test
    void solution() {
//        assertThat(keypad.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right")).isEqualTo("LRLLLRLLRRL");
//        assertThat(keypad.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left")).isEqualTo("LRLLRRLLLRR");
        assertThat(keypad.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right")).isEqualTo("LLRLLRLLRL");
    }
}
