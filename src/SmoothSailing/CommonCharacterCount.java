package SmoothSailing;

public class CommonCharacterCount {

  public static void main(String[] args) {
    System.out.println(solution("first", "second"));
  }
  static int solution(String s1, String s2) {
    int [] array1 = new int[26];
    int [] array2 = new int[26];
    int count = 0;

    for (int i = 0; i < s1.length(); i++) {
      array1[s1.charAt(i) - 'a']++;
    }

    for(int i = 0; i<s2.length(); i++){
      array2[s2.charAt(i) - 'a']++;
    }

    for (int i = 0; i < 26; i++) {
      count += Math.min(array1[i], array2[i]);

    }
    return count;
  }


}
