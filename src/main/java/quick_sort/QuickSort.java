package quick_sort;

import java.util.Arrays;

public class QuickSort
{
    public static int[] sort(int[] array)
    {
        if(array.length <= 1) {
            return array;
        }
        return sort(array, 0, array.length - 1);
    }

    private static int[] sort(int[] array, int from, int to)
    {
        if(from < to)
        {
            int pivot = partition(array, from, to);
            sort(array, from, pivot - 1);
            sort(array, pivot + 1, to);
        }
        return array;
    }

    private static int partition(int[] array, int from, int to)
    {
        int pivot = array[to];
        int i = (from-1);

        for (int j = from; j < to; j++) {
            if (array[j] <= pivot) {
                i++;

                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        int swapTemp = array[i+1];
        array[i+1] = array[to];
        array[to] = swapTemp;

        return i+1;
    }
    public static void main(String[] args) {
            System.out.println(Arrays.toString(sort(new int[]{2, 1, 4, 5, 6, 8, 7}, 0, 6)));
    }
}
