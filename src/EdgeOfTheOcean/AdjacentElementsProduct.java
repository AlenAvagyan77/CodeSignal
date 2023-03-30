package EdgeOfTheOcean;

public class AdjacentElementsProduct {

  public static void main(String[] args) {

    System.out.println(solution(new int[]{0, 2, 5, 54, 458874}));

  }
  static int solution(int[] inputArray) {

    int arrayLength = inputArray.length;
    int[] multipleArray = new int[arrayLength-1];

    for(int i=0; i<arrayLength-1; i++){
      multipleArray[i] = inputArray[i] * inputArray[i+1];
    }

    int max = multipleArray[0];
    int multipleLength = multipleArray.length;

    for(int j=0; j < multipleLength; j++){
      if( max < multipleArray[j] ){
        max = multipleArray[j];
      }
    }
    return max;
  }

}
