package 완주하지못한선수;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UnfinishedTest {
    Unfinished unfinished = new Unfinished();

    @Test
    public void solution(){
        assertThat(unfinished.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"})).isEqualTo("leo");
        assertThat(unfinished.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"})).isEqualTo("vinko");
        assertThat(unfinished.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"})).isEqualTo("mislav");
    }

}
