package sorting;

import java.util.Collections;
import java.util.LinkedList;

public class BucketSort {

    public void sort(int[] array) {
        int bucketSize = 3;
        LinkedList<Integer>[] bucket = new LinkedList[bucketSize];

        int bucketIndex;
        for (int item : array
        ) {
            bucketIndex = item / bucketSize;
            if (bucket[bucketIndex] == null) bucket[bucketIndex] = new LinkedList<>();
            bucket[bucketIndex].addLast(item);
        }

        for (int i = 0; i < bucketSize; i++) {
            Collections.sort(bucket[i]);
        }

        int k = 0;
        for (int i = 0; i < bucketSize; i++) {
            for (int j = 0; j < bucket[i].size(); j++) {
                array[k++] = bucket[i].get(j);
            }
        }
    }
}
