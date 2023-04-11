package MondaysTasks;


import java.util.*;

public class DuplicatesElement {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 3, 4, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates(numbers)));
        String [] words = {"Alen", "Artur", "Artak", "Artak"};
        System.out.println(Arrays.toString(removeDuplicates(words)));
        Character [] character = {'a', 's', 'f', 'f'};
        System.out.println(Arrays.toString(removeDuplicates(character)));


    }


    public static <T> T[] removeDuplicates(T[] array) {
        int uniqueCount = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                array[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        return Arrays.copyOf(array, uniqueCount);
    }
}
