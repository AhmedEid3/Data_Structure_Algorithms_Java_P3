package searching;

public class JumpSearch {
    public int find(int target, int[] array) {
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;

        while (start < array.length && target > array[next - 1]) {
            start = next;
            next += blockSize;

            if (next > array.length) next = array.length;
        }

        for (int i = start; i < next; i++) {
            if (target == array[i]) return i;
        }

        return -1;
    }

}
