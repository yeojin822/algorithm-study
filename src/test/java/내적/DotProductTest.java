package 내적;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DotProductTest {
    DotProduct dotProduct = new DotProduct();

    @Test
    public void test(){
        assertThat(dotProduct.solution(new int[]{1,2,3,4},new int[]{-3,-1,0,2})).isEqualTo(3);
        assertThat(dotProduct.solution(new int[]{-1,0,1},new int[]{1,0,-1})).isEqualTo(-2);
    }

}
