import array_max_value.ArrayMaxValue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ArrayMaxValueTest {

    int[] testArray= new int[]{1,4,5,6,7,8,3,21};

    @Test
    public void test() {
        int expected = 21;
        int actual = ArrayMaxValue.getMaxValue(testArray);
        Assertions.assertEquals(expected, actual);
    }
}
