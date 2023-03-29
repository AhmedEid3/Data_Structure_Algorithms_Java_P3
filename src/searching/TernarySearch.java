package searching;

public class TernarySearch {
    public int find(int target, int[] array) {
        return findRecursive(target, array, 0, array.length - 1);
    }

    public int findRecursive(int target, int[] array, int left, int right) {
        if (left > right) return -1;

        int partitionSize = (right - left) / 3;
        int middle1 = left + partitionSize;
        int middle2 = right - partitionSize;

        if (array[middle1] == target) return middle1;
        if (array[middle2] == target) return middle2;
        if (target < array[middle1]) return findRecursive(target, array, left, middle1 - 1);
        if (target > array[middle2]) return findRecursive(target, array, middle2 + 1, right);

        return findRecursive(target, array, middle1 + 1, middle2 - 1);
    }

}
