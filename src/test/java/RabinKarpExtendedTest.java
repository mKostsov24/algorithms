

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rabin_karp.RabinKarpExtended;


public class RabinKarpExtendedTest {
    private final String text = "1234512";

    @Test
    public void testPos() {
        int expected = 3;
        String queryOne = "451";
        int actual = RabinKarpExtended.search(queryOne, text);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNeg() {
        int expected = -1;
        String queryTwo = "98";
        int actual = RabinKarpExtended.search(queryTwo, text);
        Assertions.assertEquals(expected, actual);
    }

}
