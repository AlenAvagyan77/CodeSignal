package RainsOfReason;

public class ChessBoardCellColor {

  public static void main(String[] args) {
    System.out.println(solution("C3", "A5"));
  }

  static boolean solution(String cell1, String cell2) {
    return (cell1.charAt(0) + cell1.charAt(1)) % 2 == (cell2.charAt(0) + cell2.charAt(1)) % 2;

  }


}
