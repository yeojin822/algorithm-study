package 나머지가1이되는수찾기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class findOneTest {
    findOne findOne = new findOne();

    @Test
   public void test(){
        assertThat(findOne.solution(10)).isEqualTo(3);
        assertThat(findOne.solution(12)).isEqualTo(11);
    }
}
