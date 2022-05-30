package 모의고사;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExamTest {
    Exam exam = new Exam();
    @Test
    void solution() {
//        assertThat(exam.solution(new int[]{1,2,3,4,5})).isEqualTo(new int[]{1});
//        assertThat(exam.solution(new int[]{1,3,2,4,2})).isEqualTo(new int[]{1,2,3});
//        assertThat(exam.solution(new int[]{5,4,4,2,1})).isEqualTo(new int[]{});
//        assertThat(exam.solution(new int[]{3, 3, 1, 1, 1, 1, 2, 3, 4, 5})).isEqualTo(new int[]{1, 3});
//        assertThat(exam.solution(new int[]{1, 2, 5, 5, 2})).isEqualTo(new int[]{1});
        assertThat(exam.solution(new int[]{1, 1, 1, 1, 1})).isEqualTo(new int[]{3});
    }
}
