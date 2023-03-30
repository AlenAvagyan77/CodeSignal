package SmoothSailing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortByHeight {

  public static void main(String[] args) {
    int[] inputArray = {5,4,8,21,55};
    int[] result = solution(inputArray);
    System.out.println(Arrays.toString(result));
  }
  static int[] solution(int[] a) {

    List<Integer> people = new ArrayList<>();
    List<Integer> peopleHeights = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
      if(a[i] > 0){
        people.add(i);
        peopleHeights.add(a[i]);
      }
    }
    Collections.sort(peopleHeights);

    int index = 0;
    for (int i = 0; i < a.length; i++) {
      if(people.contains(i)){
        a[i] = peopleHeights.get(index);
        index++;
      }
    }
    return a;
  }


}
