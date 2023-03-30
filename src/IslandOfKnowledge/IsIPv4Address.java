package IslandOfKnowledge;

public class IsIPv4Address {

  public static void main(String[] args) {
    System.out.println(solution("172.36.211.55"));

  }
  static boolean solution(String inputString) {

    String niz[] = inputString.split("\\.");

    if(niz.length==4) {
      for(int i=0; i<niz.length; i++) {
        int b=0;
        try {
          b = Integer.parseInt(niz[i]);
        }catch(Exception e) {
          return false;
        }
        if(b<0 || b>255) return false;
      }
      return true;
    }
    else return false;
  }


}
