package 시저암호;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PwdTest {
    Pwd pwd = new Pwd();
    @Test
    void solution() {
//        assertThat(pwd.solution("AB",1)).isEqualTo("BC");
//        assertThat(pwd.solution("z",1)).isEqualTo("a");
//        assertThat(pwd.solution("a B z",4)).isEqualTo("e F d");
//        assertThat(pwd.solution("P",15)).isEqualTo("E");
        assertThat(pwd.solution("Z",20)).isEqualTo("O");
    }
}
