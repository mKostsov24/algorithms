import merge_sort.MergeSort;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MergeSortTest {
    @Test
    public void test() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }


}
