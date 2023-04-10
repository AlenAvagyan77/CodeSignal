package MondaysTasks;

import java.util.Arrays;

public class ClosetPair {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findClosestPair(new int[]{0, 22, 28, 29, 30, 40}, 54)));
    }

    public static int[] findClosestPair(int[] arr, int x) {
        System.out.println("Sum of two numbers are : " + x);
        int n = arr.length;
        if (n < 2) {
            System.out.println("Array should have at least two elements.");
        }
        int left = 0;
        int right = arr.length - 1;
        int diff = Integer.MAX_VALUE;
        int closestPairLeft = -1;
        int closestPairRight = -1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum - x) < diff) {
                diff = Math.abs(sum - x);
                closestPairLeft = left;
                closestPairRight = right;
            }
            if (sum < x) {
                left++;
            }
            else {
                right--;
            }
        }

        System.out.println("The closest pair of numbers is : " + arr[closestPairLeft] + " and " + arr[closestPairRight]);
        return arr;
    }
}
