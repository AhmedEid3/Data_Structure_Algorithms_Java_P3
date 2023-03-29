package sorting;

import java.util.Arrays;

public class CountingSort {

    public void sort(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int[] countArray = new int[max];

        for (int item : array) {
            countArray[item - 1]++;
        }

        int k = 0;
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                array[k++] = i + 1;
            }
        }

    }
}
