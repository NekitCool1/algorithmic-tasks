package day5_0108;

import java.util.Arrays;

public class SortArray {

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int forward = arr[i];
            int prev = arr[i - 1];
            int back = i - 1;

            while (back >= 0 && arr[back] > forward) {
                arr[back + 1] = arr[back];
                back = back - 1;
            }
            arr[back + 1] = forward;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {15,14,14,13,6,7,5,4,3,2,1};

        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
