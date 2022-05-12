package 예산;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {
    Budget budget = new Budget();

    @Test
    void solution() {
        assertThat(budget.solution(new int[]{1,3,2,5,4},9)).isEqualTo(3);
        assertThat(budget.solution(new int[]{2,2,3,3},10)).isEqualTo(4);
        assertThat(budget.solution(new int[]{2,2,2},1)).isEqualTo(0);
    }
}
