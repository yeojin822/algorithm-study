package 자릿수더하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlaceSumTest {
    PlaceSum placeSum = new PlaceSum();

    @Test
    void solution() {
        assertThat(placeSum.solution(123)).isEqualTo(6);
        assertThat(placeSum.solution(987)).isEqualTo(24);
    }
}
