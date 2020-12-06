package sorters;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 3, 4, 10, 15, 11};
        insertSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] insertSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i + 1];
            int index = i;
            while (index >= 0 && temp < arr[index]) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = temp;
        }
        return arr;
    }

/**
 * Code Example
 */
//    package base.sorter;
//
//        import java.util.Arrays;
//
//    public class insertSort {
//
//        public static int[] unsortArray = new int[]{1,5,2,9,3,4,10,15,11};
//
//        public static void main(String[] args){
//
//            for(int i = 0; i < unsortArray.length-1; i++){
//                int currentValue = unsortArray[i+1]; // 找到待排序的点
//                int preIndex = i;
//                while(preIndex >= 0 && currentValue < unsortArray[preIndex]){ // 若发现未排序的数比已排序的小
//                    unsortArray[preIndex+1] = unsortArray[preIndex];
//                    preIndex -= 1;
//                }
//                unsortArray[preIndex+1] = currentValue; // 把值塞到找到的位置上
//            }
//            System.out.println(Arrays.toString(unsortArray));
//        }
//    }
}
