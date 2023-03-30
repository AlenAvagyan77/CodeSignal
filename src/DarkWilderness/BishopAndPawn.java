package DarkWilderness;

public class BishopAndPawn {

  public static void main(String[] args) {
    System.out.println(solution("A1", "E5"));

  }
  static boolean solution(String bishop, String pawn) {
    return(Math.abs(bishop.charAt(0) - pawn.charAt(0))) == (Math.abs(bishop.charAt(1) - pawn.charAt(1)));
  }

}
