package 행렬의덧셈;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    Matrix matrix = new Matrix();

    @Test
    void solution() {
        assertThat(matrix.solution(new int[][]{{1,2},{2,3}},new int[][]{{3,4},{5,6}})).isEqualTo(new int[][]{{4,6},{7,9}});
        assertThat(matrix.solution(new int[][]{{1},{2}},new int[][]{{3},{4}})).isEqualTo(new int[][]{{4},{6}});
    }
}
