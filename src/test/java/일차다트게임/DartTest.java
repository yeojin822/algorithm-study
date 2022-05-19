package 일차다트게임;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DartTest {
        Dart dart = new Dart();
    @Test
    void solution() {
        assertThat(dart.solution("1S2D*3T")).isEqualTo(37);
        assertThat(dart.solution("1D2S#10S")).isEqualTo(9);
        assertThat(dart.solution("1D2S0T")).isEqualTo(3);
        assertThat(dart.solution("1S*2T*3S")).isEqualTo(23);
        assertThat(dart.solution("1D#2S*3S")).isEqualTo(5);
        assertThat(dart.solution("1T2D3D#")).isEqualTo(-4);
        assertThat(dart.solution("1D2S3T*")).isEqualTo(59);
    }
}
