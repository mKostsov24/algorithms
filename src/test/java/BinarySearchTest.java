import binary_search.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchTest {
    private final ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("1","3","4","5","6","7","8","21"));
    @Test
    public void testPos() {
        String string = "7";
        BinarySearch test = new BinarySearch(stringArrayList);
        int actual = test.search(string);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNeg() {
        String string = "6";
        BinarySearch test = new BinarySearch(stringArrayList);
        int actual = test.search(string);
        int expected = 5;
        Assertions.assertNotEquals(expected, actual);
    }
}
