package LandOfLogic;

import java.math.BigInteger;

public class MessageFromBinaryCode {

  public static void main(String[] args) {
    System.out.println(solution("010010000110010101101100011011000110111100100001"));
  }
  static String solution(String code) {
    return new String(new BigInteger(code, 2).toByteArray());
  }


}
