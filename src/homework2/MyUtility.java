package homework2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyUtility {
    public <T extends IComparable> void sort(T[] comparableList) {
        if (comparableList.length <= 1) {
            return;
        }

        int mid = comparableList.length / 2;
        T[] left = Arrays.copyOfRange(comparableList, 0, mid);
        T[] right = Arrays.copyOfRange(comparableList, mid, comparableList.length);

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

    public <T extends IComparable> void sort(ArrayList<T> comparableArrayList) {
        if (comparableArrayList.size() <= 1) {
            return;
        }

        // 将列表分为两部分，分别进行排序
        int mid = comparableArrayList.size() / 2;
        ArrayList<T> left = new ArrayList<>(comparableArrayList.subList(0, mid));
        ArrayList<T> right = new ArrayList<>(comparableArrayList.subList(mid, comparableArrayList.size()));
        sort(left);
        sort(right);

        // 将排好序的两个子列表合并成一个有序列表
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                comparableArrayList.set(k++, left.get(i++));
            } else {
                comparableArrayList.set(k++, right.get(j++));
            }
        }
        while (i < left.size()) {
            comparableArrayList.set(k++, left.get(i++));
        }
        while (j < right.size()) {
            comparableArrayList.set(k++, right.get(j++));
        }
    }




}
