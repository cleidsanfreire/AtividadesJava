package atividadesExtras.lambdas;

import java.util.Arrays;
import java.util.List;

/*
14.Redução com Stream API: Dada uma lista de inteiros, utilize a
operação reduce() para calcular a soma de todos os números da lista.
 */
public class ex5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaNumber = numeros.stream().reduce(0, (a, b) -> a + b);

        System.out.println(somaNumber);
    }
}
