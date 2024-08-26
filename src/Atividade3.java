import java.util.Arrays;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int valor1, valor2, valor3;

        while (true) {

            System.out.println("Digite um numero:");
            valor1 = tec.nextInt();

            System.out.println("Digite um numero:");
            valor2 = tec.nextInt();

            System.out.println("Digite um numero:");
            valor3 = tec.nextInt();

            if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
                break;
            }
        }

        int[] valores = {valor1,valor2,valor3};

        Arrays.sort(valores);

        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }


    }
}
