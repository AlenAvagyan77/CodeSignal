package MondaysTasks;

import java.util.Arrays;

public class ZigZag {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(zigzag(new int[]{4, 3, 7, 8, 6, 2, 1})));

    }
    public static int[] zigzag(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}