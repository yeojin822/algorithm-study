package 이상한문자만들기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MakeStringTest {
    MakeString makeString = new MakeString();

    @Test
    void solution() {
        assertThat(makeString.solution("try hello world")).isEqualTo("TrY HeLlO WoRlD");
        assertThat(makeString.solution("try  hello   world")).isEqualTo("TrY  HeLlO   WoRlD");
        assertThat(makeString.solution("Hello eVeryone")).isEqualTo("HeLlO EvErYoNe");
    }
}
