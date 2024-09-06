import java.util.*;
import java.util.stream.Collectors;

public class ChatExercicios {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "streams", "lambdas", "example");

        List<String> wordsUpper = words.stream().map(s -> s.toUpperCase(Locale.US)).collect(Collectors.toList());
        System.out.println(wordsUpper);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int numberQuadrado = numbers.stream().map(n -> n * n).reduce(0, (a, b) -> a + b);

        System.out.println(numberQuadrado);

        List<String> words2 = Arrays.asList("apple", "banana", "kiwi", "pineapple");

        List<String> words2Order = words2.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).toList();
        List<String> words2Order2 = words2.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        System.out.println(words2Order);
        System.out.println(words2Order2);

        List<String> words3 = Arrays.asList("apple", "banana", "apple", "kiwi", "banana", "apple");

        Map<Character, List<String>> words3Oco = words3.stream()
                .collect(Collectors.groupingBy(word3 -> word3.charAt(0)));

        System.out.println(words3Oco);
    }
}
