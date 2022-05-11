package 최소직사각형;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle = new Rectangle();

    @Test
    public void test(){
        assertThat(rectangle.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}})).isEqualTo(4000);
        assertThat(rectangle.solution(new int[][]{{10, 7}, {12, 3},{8, 15},{14, 7},{5, 15}})).isEqualTo(120);
        assertThat(rectangle.solution(new int[][]{{14, 4}, {19, 6},{6, 16},{18, 7},{7, 11}})).isEqualTo(133);
    }

}
