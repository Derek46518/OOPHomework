package homework2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyUtility {
    public  void sort(IComparable[] comparableList) {
        if (comparableList.length <= 1) {
            return;
        }

        int mid = comparableList.length / 2;
        IComparable[] left = Arrays.copyOfRange(comparableList, 0, mid);
        IComparable[] right = Arrays.copyOfRange(comparableList, mid, comparableList.length);
        sort(left);
        sort(right);
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                comparableList[k++] = left[i++];
            } else {
                comparableList[k++] = right[j++];
            }
        }
        while (i < left.length) {
            comparableList[k++] = left[i++];
        }
        while (j < right.length) {
            comparableList[k++] = right[j++];
        }
    }






}
