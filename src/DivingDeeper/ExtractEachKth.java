package DivingDeeper;

import java.util.Arrays;

public class ExtractEachKth {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(new int[]{55, 22, 38, 3, 5, 4, 8}, 3)));
  }
  static int[] solution(int[] inputArray, int k) {
    if(inputArray == null || inputArray.length <=k || k <=0){
      return inputArray;
    }

    int count = 0;
    for(int i = 0; i < inputArray.length; i++){
      if((i + 1) % k == 0){
        count++;
      }else{
        inputArray[i - count] = inputArray[i];
      }
    }
    return Arrays.copyOf(inputArray, inputArray.length - count);

  }


}
