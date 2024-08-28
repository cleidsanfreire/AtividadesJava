package netExercicios;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double salario1,salario2,salario3,salario4,media;

        System.out.println("Digite o valor do 1° salario");
        salario1 = tec.nextDouble();
        System.out.println("Digite o valor do 2° salario");
        salario2 = tec.nextDouble();
        System.out.println("Digite o valor do 3° salario");
        salario3 = tec.nextDouble();
        System.out.println("Digite o valor do 4° salario");
        salario4 = tec.nextDouble();

        media = (salario1 + salario2 + salario3 + salario4) / 4;

        System.out.println("A Media Salarial é de: " + media);

    }
}
