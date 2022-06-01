package 가운데글자가져오기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MidLetterTest {
    MidLetter midLetter = new MidLetter();
    @Test
    void solution() {
    assertThat(midLetter.solution("abcde")).isEqualTo("c");
    assertThat(midLetter.solution("qwer")).isEqualTo("we");
    }
}