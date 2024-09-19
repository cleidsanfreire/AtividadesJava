package atividadesExtras.lambdas;

import java.util.Arrays;
import java.util.List;

/*
12.Filtros com Stream API: Dado uma lista de inteiros, use a Stream
API para filtrar os números pares, multiplicá-los por 2 e exibir os
resultados.
 */
public class ex2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> num = numeros.stream().filter(s -> s % 2 == 0).map(s -> s * 2).toList();
        System.out.println(num);
    }
}
