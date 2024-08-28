package netExercicios;

import java.util.Scanner;

/*
 Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A,
 em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e de raio.
Agora vamos escrever a fórmula, conforme dita no enunciado e,
em seguida, exibir na tela uma mensagem contendo o resultado do volume encontrado.
 */
public class Atividade3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double v, r, a;

        System.out.println("Digite um valor para o raio: ");
        r = tec.nextDouble();
        System.out.println("Digite um valor para a altura: ");
        a = tec.nextDouble();

        v = 3.14159 * r * r * a;

        System.out.printf("O Volume encontrado da lata de Óleo é de: %.2f m³", v);

    }
}
