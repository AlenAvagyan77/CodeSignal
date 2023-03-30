package ThroughTheFog;

public class DepositProfit {

  public static void main(String[] args) {
    System.out.println(solution(100, 20 ,170));

  }
  static int solution(int deposit, int rate, int threshold) {
    int year = 0;
    double depositDouble = (double) deposit;
    while(depositDouble < threshold){
      depositDouble *= ((double) rate / 100 + 1);
      ++year;
    }
    return year;
  }


}
