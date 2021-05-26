import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import quick_sort.QuickSort;

public class QuickSortTest {
    int[] testArray=TestData.getArray();

    @Test
    public void test() {
        int[] expected = new int[]{1,3,4,5,6,7,8,21};
        int[] actual = QuickSort.sort(testArray);
        Assertions.assertArrayEquals(expected, actual);
    }
}
