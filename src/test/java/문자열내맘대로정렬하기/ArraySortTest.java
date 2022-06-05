package 문자열내맘대로정렬하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArraySortTest {
    ArraySort arraySort = new ArraySort();

    @Test
    void solution() {
//        assertThat(arraySort.solution(new String[]{"sun", "bed", "car"},1)).isEqualTo(new String[]{"car", "bed", "sun"});
//        assertThat(arraySort.solution(new String[]{"abce", "abcd", "cdx"},2)).isEqualTo(new String[]{"abcd", "abce", "cdx"});
//        assertThat(arraySort.solution(new String[]{"ae","be","ce","ae"},1)).isEqualTo(new String[]{"ae","ae","be","ce"});
//        assertThat(arraySort.solution(new String[]{"zbcde", "ybcdf", "xbcdg"},1)).isEqualTo(new String[]{"xbcdg", "ybcdf", "zbcde"});
//        assertThat(arraySort.solution(new String[]{"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"},2)).isEqualTo(new String[]{"abzaa","abzbb","abzcd","abzfg","bbzaa","cdzab"});
        assertThat(arraySort.solution(new String[]{"aea", "ba", "ce", "aee"},1)).isEqualTo(new String[]{"ba", "aea", "aee","ce" });

    }
}