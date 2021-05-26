package array_max_value;

public class ArrayMaxValue {
    public static int getMaxValue(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Пустой массив");
        }

        int maxValue = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }


    public static void main(String[] args) {
        try {
            System.out.println(getMaxValue(new int[]{}));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}