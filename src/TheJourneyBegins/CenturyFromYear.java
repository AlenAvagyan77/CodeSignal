package TheJourneyBegins;

public class CenturyFromYear {

  public static void main(String[] args) {
    System.out.println(solution(2003));
  }

  static int solution(int year) {
    int centuryCount = 0;
    while (year > 0){
      year = year - 100;
      centuryCount = centuryCount + 1;
    }
    return centuryCount;
  }

}
