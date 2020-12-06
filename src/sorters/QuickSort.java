package sorters;

import java.util.Arrays;

public class QuickSort {
    private static int[] arr = {1, 5, 2, 9, 3, 4, 10, 15, 11};

    public static void main(String[] args) {
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int low, int high) {
        int temp, i, j = 0;

        if (low > high) return;

        i = low;
        j = high;
        temp = arr[low];

        //寻找不符合的值
        while (i < j) {
            //从右边找
            while (temp <= arr[j] && i < j) {
                j--;
            }

            //从左边找
            while (temp >= arr[i] && i < j) {
                i++;
            }

            //如果满足条件则交换
            if (i < j) {
                swap(arr, i, j);
            }
        }


        //此时ij指向同一个值
        arr[low] = arr[i];
        arr[i] = temp;

        quickSort(arr, low, j - 1);

        quickSort(arr, j + 1, high);


    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
