import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaExemples {

    public static void main(String[] args) {
       List<String> frutas = Arrays.asList("Uva","Maça","Banana","Perá","Morango","Melancia");

        List<String> frutasFiltradas = frutas.stream().filter(f -> f.length() > 5).toList();

        String frutasConcaternar = String.valueOf(frutas.stream().reduce((a, b) -> a + ", " + b).orElse(""));

        System.out.println(frutasConcaternar);

        List<String> nome = frutas.stream().map(s -> s + " ").toList();

        System.out.println(nome);

//        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//
//        //num.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
//
//        List<Integer> numFilter =  num.stream().filter(f -> f % 2 == 0).collect(Collectors.toList());
//
//        int soma = numFilter.stream().reduce(0,(a,b) -> a + b);
//
//        System.out.println("Numeros Pares: " + numFilter + " A soma desses numeros é: " + soma);

        List<String> words = Arrays.asList("apple", "abanana", "alus", "kiwi", "banana", "apple");

        long wordsCount = words.stream().filter(s -> s.toLowerCase().startsWith("a")).count();

        System.out.println(wordsCount);
    }
}
