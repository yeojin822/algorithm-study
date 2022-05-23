package 로또의최고순위와최저순위;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LottoTest {
    Lotto lotto = new Lotto();

    @Test
    void solution() {
    assertThat(lotto.solution(new int[]{44, 1, 0, 0, 31, 25},new int[]{31, 10, 45, 1, 6, 19})).isEqualTo(new int[]{3, 5});
    assertThat(lotto.solution(new int[]{0, 0, 0, 0, 0, 0},new int[]{38, 19, 20, 40, 15, 25})).isEqualTo(new int[]{1, 6});
    assertThat(lotto.solution(new int[]{45, 4, 35, 20, 3, 9},new int[]{20, 9, 3, 45, 4, 35})).isEqualTo(new int[]{1, 1});
    }
}