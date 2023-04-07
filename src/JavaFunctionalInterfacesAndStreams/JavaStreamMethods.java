package JavaFunctionalInterfacesAndStreams;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStreamMethods {

  public static void main(String[] args) {
    System.out.println("1. filter(): This method is used to filter elements from a stream based on a given"
        + " condition. It returns a new stream that contains only the elements that satisfy the condition.");
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    List<Integer> evenNumbers = numbers.stream()
        .filter(n -> n % 2 == 0)
        .toList();
    System.out.println(evenNumbers);
    System.out.println("In this example, we create a list of integers and then create a stream from it."
        + " We use the filter() method to filter out all odd numbers and \n"
        + "create a new stream that contains only the even numbers."
        + " We then collect the even numbers into a new list using the"
        + " collect() method and the Collectors.toList() collector.\n");
    System.out.println("2. map(): This method is used to transform each element in a stream into another element. "
        + "It returns a new stream that contains the transformed elements."
        + "Map is a method to work , for example, on each element in a list or array and then return a single list.");
    List<String> words = Arrays.asList("hello", "world", "java", "streams");
    List<Integer> wordLengths = words.stream()
        .map(String::length)
        .toList();
    System.out.println(wordLengths);
    System.out.println("In this example, we create a list of strings and then create a stream from it.\n "
        + "We use the map() method to transform each string into its length and create a new stream that contains the lengths.\n"
        + "We then collect the lengths into a new list using the collect() method and the Collectors.toList() collector. \n");
    System.out.println("3. flatMap(): This method is used to flatten a stream of streams into a single stream."
        + " It returns a new stream that contains all the elements of the flattened streams."
        + "FlatMap() is a method when, for example, you have multiple lists and want to work with them into one major list?");
    List<List<Integer>> numbers1 = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5), Arrays.asList(6, 7, 8, 9));
    List<Integer> flattenedNumbers = numbers1.stream()
        .flatMap(Collection::stream)
        .toList();
    System.out.println(flattenedNumbers);
    System.out.println("In this example, we create a list of lists of integers and then create a stream from it.\n"
        + " We use the flatMap() method to flatten the list of lists into a single stream that contains all the integers.\n"
        + " We then collect the integers into a new list using the collect() method and the Collectors.toList() collector.\n");
    System.out.println("4. reduce(): This method is used to perform a reduction operation on a stream.\n"
        + " It takes two arguments: an initial value and a BinaryOperator that combines two elements into a single result.\n"
        + " It returns an Optional that contains the final result of the reduction operation");
    List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
    Optional<Integer> sum = numbers2.stream()
        .reduce(Integer::sum);
    System.out.println(sum);
    System.out.println("In this example, we create a list of integers and then create a stream from it.\n"
        + " We use the reduce() method to add all the integers in the stream and return the sum as an Optional.\n"
        + " Note that the reduce() method is called on the stream itself, not on a collector.\n");
    System.out.println("5. forEach(): This method is used to perform an action on each element in a stream. It does not return a value.");
    List<String> words1 = Arrays.asList("hello", "world", "java", "streams");
    words1.forEach(s -> System.out.print(s + " "));
    System.out.println();
    System.out.println();
    System.out.println("6. forEachOrdered(): This method is used to perform an action on each element in a stream in a specific order. It does not return a value.");
    List<String> words2 = Arrays.asList("hello", "world", "java", "streams");
    words2.stream()
        .forEachOrdered(s -> System.out.print(s + " "));
    System.out.println();
    System.out.println();
    System.out.println("7. toArray(): This method is used to convert a stream into an array.");
    List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
    Integer[] numberArray = numbers3.stream()
        .toArray(Integer[]::new);
    System.out.println(Arrays.toString(numberArray));
    System.out.println();
    System.out.println("8. collect(): This method is used to collect the elements of a stream into a collection or other data structure.");
    List<String> words3 = Arrays.asList("hello", "world", "java", "streams");
    List<String> uppercaseWords = words3.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
    System.out.println(uppercaseWords);
    System.out.println();
    System.out.println("9. min(): This method is used to find the minimum element in a stream. It returns an Optional.");
    List<Integer> numbers4 = Arrays.asList(5, 3, 9, 1, 7);
    Optional<Integer> minNumber = numbers4.stream()
        .min(Integer::compareTo);
    System.out.println(minNumber);
    System.out.println();
    System.out.println("10. max(): This method is used to find the maximum element in a stream. It returns an Optional.");
    List<Integer> numbers5 = Arrays.asList(5, 3, 9, 1, 7);
    Optional<Integer> maxNumber = numbers5.stream()
        .max(Integer::compareTo);
    System.out.println(maxNumber);
    System.out.println();
    System.out.println("11. count(): This method is used to count the number of elements in a stream. It returns a long");
    List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5);
    long count = numbers6.stream().count();
    System.out.println(count);
    System.out.println();
    System.out.println("12. distinct(): This method is used to remove duplicate elements from a stream.\n"
        + "It returns a new stream that contains only the distinct elements.");
    List<Integer> numbers7 = Arrays.asList(1, 2, 3, 3, 4, 4, 5);
    List<Integer> distinctNumbers7 = numbers7.stream().distinct().toList();
    System.out.println(distinctNumbers7);
    System.out.println();
    System.out.println("13. skip(): This method is used to skip the first n elements of a stream.\n"
        + "It returns a new stream that contains the remaining elements.");
    List<Integer> numbers8 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> skippedNumbers = numbers8.stream().skip(1).toList();
    System.out.println(skippedNumbers);
    System.out.println();
    System.out.println("14. limit(): This method is used to limit the number of elements in a stream to n.\n"
        + "It returns a new stream that contains the first n elements.");
    List<Integer> numbers9 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> limitedNumbers = numbers9.stream().limit(3).toList();
    System.out.println(limitedNumbers);
    System.out.println();
    System.out.println("15. sorted(): This method is used to sort the elements of a stream in natural order or a specified order.\n"
        + "It returns a new stream that contains the sorted elements.");
    List<Integer> numbers10 = Arrays.asList(5, 3, 9, 1, 7);
    List<Integer> sortedNumbers = numbers10.stream().sorted().toList();
    System.out.println(sortedNumbers);
  }
}
