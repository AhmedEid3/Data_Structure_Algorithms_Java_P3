package searching;

public class LinerSearch {

    public int find(int target, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }

        return -1;
    }
}
