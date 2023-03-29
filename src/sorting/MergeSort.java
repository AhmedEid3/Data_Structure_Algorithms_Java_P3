package sorting;

public class MergeSort {

    public void sort(int[] array) {
        // base case
        if (array.length <= 1) return;

        // find middle index
        int middleIndex = array.length / 2;

        int[] leftArray = fillArray(array, middleIndex, 0);
        int[] rightArray = fillArray(array, array.length - middleIndex, middleIndex);

        sort(leftArray);
        sort(rightArray);

        merge(leftArray, rightArray, array);
    }

    private void merge(int[] leftArray, int[] rightArray, int[] result) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                result[k++] = leftArray[i++];
            } else {
                result[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            result[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            result[k++] = rightArray[j++];
        }
    }

    private int[] fillArray(int[] array, int size, int start) {
        int[] copyArray = new int[size];

        for (int i = start; i < size + start; i++) {
            if (start > 0) copyArray[i - start] = array[i];
            else copyArray[i] = array[i];

        }
        return copyArray;
    }
}
