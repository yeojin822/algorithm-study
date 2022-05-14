package 크레인인형뽑기게임;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CraneTest {
    Crane crane = new Crane();

    @Test
    void solution() {
        assertThat(crane.solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4})).isEqualTo(4);
        assertThat(crane.solution(new int[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}}, new int[]{1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5})).isEqualTo(24);
        assertThat(crane.solution(new int[][]{{0, 0, 0, 0, 0},{0, 0, 1, 0, 3},{0, 2, 5, 0, 1},{4, 2, 4, 4, 2},{3, 5, 1, 3, 1}}, new int[]{1, 4, 5, 3, 5})).isEqualTo(4);
        assertThat(crane.solution(new int[][]{{0, 0, 1, 0, 0},{0, 0, 1, 0, 0},{0, 2, 1, 0, 0},{0, 2, 1, 0, 0},{0, 2, 1, 0, 0}}, new int[]{1, 2, 3, 3, 2, 3, 1})).isEqualTo(4);

    }
}

