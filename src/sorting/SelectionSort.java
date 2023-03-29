package sorting;

public class SelectionSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, minIndexFrom(i, array), i);
        }
    }

    private int minIndexFrom(int start, int[] array) {
        if (array.length == 0) return -1;
        if (array.length < start) throw new IndexOutOfBoundsException();

        int indexMin = start;
        for (int j = start; j < array.length; j++) {
            if (array[j] < array[indexMin]) {
                indexMin = j;
            }
        }

        return indexMin;
    }


    private void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
