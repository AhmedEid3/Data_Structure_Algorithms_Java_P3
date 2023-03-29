package searching;

public class BinarySearch {
    public int find(int target, int[] array) {
        return findIterative(target, array);
//        return findRecursive(target, array, 0, array.length - 1);
    }

    public int findRecursive(int target, int[] array, int left, int right) {
        if (right < left) return -1;

        int middle = (right + left) / 2;
        if (array[middle] == target) return middle;

        return target < array[middle] ?
                findRecursive(target, array, left, middle - 1) :
                findRecursive(target, array, middle + 1, right);
    }

    public int findIterative(int target, int[] array) {

        int left = 0, right = array.length - 1;
        int middle;

        while (left <= right) {
            middle = (left + right) / 2;

            if (target == array[middle]) return middle;
            else if (target < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }
}
