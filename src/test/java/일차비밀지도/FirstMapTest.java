package 일차비밀지도;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FirstMapTest {
    FirstMap firstMap = new FirstMap();

    @Test
    void solution() {
        assertThat(firstMap.solution(5,new int[]{9, 20, 28, 18, 11},new int[]{30, 1, 21, 17, 28})).isEqualTo(new String[]{"#####", "# # #", "### #", "#  ##", "#####"});
        assertThat(firstMap.solution(6,new int[]{46, 33, 33 ,22, 31, 50},new int[]{27 ,56, 19, 14, 14, 10})).isEqualTo(new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "});
    }
}
