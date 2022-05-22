package 신규아이디추천;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class newIdTest {
    newId newId = new newId();

    @Test
    void solution() {
        assertThat(newId.solution("...!@BaT#*..y.abcdefghijklm")).isEqualTo("bat.y.abcdefghi");
        assertThat(newId.solution("z-+.^.")).isEqualTo("z--");
        assertThat(newId.solution("=.=")).isEqualTo("aaa");
        assertThat(newId.solution("123_.def")).isEqualTo("123_.def");
        assertThat(newId.solution("abcdefghijklmn.p")).isEqualTo("abcdefghijklmn");
    }
}