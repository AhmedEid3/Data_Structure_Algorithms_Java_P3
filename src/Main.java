import sorting.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 3, 3, 1, 1, 4, 5, 6};

        var sorter = new QuickSort();

        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}