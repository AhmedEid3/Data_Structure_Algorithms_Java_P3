package sorting;

public class QuickSort {

    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int start, int end) {
        if (start >= end) return;

        int boundary = start - 1;
        int pivot = array[end];

        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot || i == end) swap(array, ++boundary, i);
        }

        sort(array, 0, boundary - 1);
        sort(array, boundary + 1, end);
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

}
