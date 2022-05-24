package 신고결과받기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ResultTest {
    Result result = new Result();
    @Test
    void solution() {
    assertThat(result.solution(new String[]{"muzi", "frodo", "apeach", "neo"},new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},2)).isEqualTo(new int[]{2,1,1,0});
    assertThat(result.solution(new String[]{"con", "ryan"},new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},3)).isEqualTo(new int[]{0,0});
    }
}