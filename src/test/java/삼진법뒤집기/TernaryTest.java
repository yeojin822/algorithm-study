package 삼진법뒤집기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TernaryTest {
    Ternary ternary = new Ternary();

    @Test
    public void test() {
        assertThat(ternary.solution(45)).isEqualTo(7);
        assertThat(ternary.solution(125)).isEqualTo(229);
}

}