package LandOfLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileNaming {

  public static void main(String[] args) {
    System.out.println(solution(new String[]{"doc, doc, image, doc"}));

  }
  static Object solution(String[] names) {
    List<String> input = Arrays.asList(names);
    List<String> result = new ArrayList<>();
    for( String s : names ){
      if(result.contains(s)){
        int i = 1;
        for(; result.contains(s+"("+i+")") ;i++){

        }
        s+="("+i+")";
      }
      result.add(s);
    }
    return result;
  }


}
