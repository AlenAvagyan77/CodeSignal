package RainbowofClarity;

public class ChessKnight {

  public static void main(String[] args) {
    System.out.println(solution("A1"));

  }
  static int solution(String cell) {
    int moves = 8;
    if (cell.charAt(0) == 'b' || cell.charAt(0) == 'g') {
      moves -= 2;
    }
    if (cell.charAt(1) == '2' || cell.charAt(1) == '7') {
      moves -= 2;
    }
    if (cell.charAt(0) == 'a' || cell.charAt(0) == 'h') {
      moves /= 2;
    }
    if (cell.charAt(1) == '1' || cell.charAt(1) == '8') {
      moves /= 2;
    }
    return moves;
  }


}
