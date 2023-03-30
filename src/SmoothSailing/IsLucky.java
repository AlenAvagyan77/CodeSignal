package SmoothSailing;

public class IsLucky {

  public static void main(String[] args) {
    System.out.println(solution(10));

  }
  static boolean solution(int n) {
    String ticketStr = Integer.toString(n);

    if(ticketStr.length() %2 !=0){
      return false;
    }

    String firstHalf =  ticketStr.substring(0, ticketStr.length() /2);
    String secondHalf =  ticketStr.substring(ticketStr.length() /2);


    int firstHalfSum = 0;
    int secondHalfSum = 0;

    for(int i = 0; i < firstHalf.length(); i++){
      firstHalfSum += Character.getNumericValue(firstHalf.charAt(i));
      secondHalfSum += Character.getNumericValue(secondHalf.charAt(i));
    }
    return firstHalfSum == secondHalfSum;
  }

}
