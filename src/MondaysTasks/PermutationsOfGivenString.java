package MondaysTasks;

import java.util.Scanner;

public class PermutationsOfGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.print("All permutations of the string are:");
        System.out.println();
        permutations("", str);
    }


    public static <T> void permutations(T current, String remaining) {
        if (remaining.length() == 0) {
            System.out.print(current + " ");
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                T newPrefix = (T) (current.toString() + remaining.charAt(i));
                String newSuffix = remaining.substring(0, i) + remaining.substring(i + 1);
                permutations(newPrefix, newSuffix);


            }
        }
    }
}
