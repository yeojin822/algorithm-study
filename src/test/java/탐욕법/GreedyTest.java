package 탐욕법;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GreedyTest {
    Greedy greedy = new Greedy();

    @Test
    void solution() {
        assertThat(greedy.solution(5, new int[]{2, 4}, new int[]{1, 3, 5})).isEqualTo(5);
        assertThat(greedy.solution(5, new int[]{2, 4}, new int[]{3})).isEqualTo(4);
        assertThat(greedy.solution(3, new int[]{3}, new int[]{1})).isEqualTo(2);
        assertThat(greedy.solution(30, new int[]{1, 2, 7, 9, 10, 11, 12, 14, 15, 16, 18, 20, 21, 24, 25, 27}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 20, 22, 23, 24, 25, 26, 27, 28})).isEqualTo(30);
        assertThat(greedy.solution(5, new int[]{1, 2, 4}, new int[]{2, 4, 5})).isEqualTo(4);
        assertThat(greedy.solution(5, new int[]{1, 2, 4}, new int[]{2, 3, 4, 5})).isEqualTo(4);
    }
}
