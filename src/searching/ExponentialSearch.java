package searching;

public class ExponentialSearch {

    public int find(int target, int[] array) {
        int bound = 1;

        while (bound < array.length && target > array[bound]) {
            bound *= 2;
        }

        int left = bound/2;
        int right = Math.min(bound, array.length - 1);

        return new BinarySearch().findRecursive(target, array, left, right);

    }

}
