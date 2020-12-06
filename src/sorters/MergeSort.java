package sorters;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 3, 4, 10, 15, 11};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length < 2) return arr;
        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);


        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length) { //左侧走完
                result[index] = right[j];
                j++;
            } else if (j >= right.length) { //右侧走完
                result[index] = left[i];
                i++;
            } else if (left[i] < right[j]) {
                result[index] = left[i];
                i++;
            } else if (left[i] > right[j]) {
                result[index] = right[j];
                j++;
            }
        }
        return result;
    }
}
