package RainsOfReason;

public class VariableName {

  public static void main(String[] args) {
    System.out.println(solution("Instigate_Mobile"));
  }
  static boolean solution(String name) {
    return name.matches("[a-zA-Z_][a-zA-Z0-9_]*");
  }


}
