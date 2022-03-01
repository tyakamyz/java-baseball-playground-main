package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void requirementCase1() {

        /*  "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다. */
        String splitExampleString = "1,2";
        String[] splitExampleStringArray = splitExampleString.split(",");
        assertThat(splitExampleStringArray).contains("1");              // 포함 여부 확인
        assertThat(splitExampleStringArray).containsExactly("1","2");   // 순서를 포함해서 정확히 일치

        /* "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다. */
        splitExampleString = "1";
        splitExampleStringArray = splitExampleString.split(",");
        assertThat(splitExampleStringArray).contains("1");          // 포함 여부 확인
        assertThat(splitExampleStringArray).containsExactly("1");   // 순서를 포함해서 정확히 일치

    }

    @Test
    void requirementCase2() {

        /* "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다. */
        String resultString = "1,2";
        String splitExampleString = "(1,2)";
        splitExampleString = splitExampleString.substring(1,splitExampleString.length()-1);

        assertThat(splitExampleString).isEqualTo(resultString);
    }

}
