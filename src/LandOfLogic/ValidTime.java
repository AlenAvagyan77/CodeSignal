package LandOfLogic;

public class ValidTime {

  public static void main(String[] args) {
    System.out.println(solution("17:17"));
  }
  static boolean solution(String time) {
    String [] digit = time.split(":");

    if(Integer.parseInt(digit[0]) <= 23 & Integer.parseInt(digit[1]) <= 59)
      return true;
    return false;
  }

}
