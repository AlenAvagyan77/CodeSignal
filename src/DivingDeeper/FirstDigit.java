package DivingDeeper;

public class FirstDigit {

  public static void main(String[] args) {
    System.out.println(solution("var_1__Int_2_Int"));
  }
  static char solution(String inputString) {
    if(inputString  == null || inputString.isEmpty()){
      return ' ';
    }
    for(char c : inputString.toCharArray()){
      if(Character.isDigit(c)){
        return c;
      }
    }
    return ' ';
  }

}
