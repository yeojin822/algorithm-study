package 이공일육;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoThousandSixteenTest {
    TwoThousandSixteen twoThousandSixteen = new TwoThousandSixteen();
    @Test
    void solution() {
        assertThat(twoThousandSixteen.solution(5,24)).isEqualTo("TUE");
        assertThat(twoThousandSixteen.solution(1,3)).isEqualTo("SUN");
    }
}
