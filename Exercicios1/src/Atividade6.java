import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        try {
            Scanner tec = new Scanner(System.in);

            System.out.println("Digite o nome do aluno: ");
            String name = tec.next();

            System.out.println("Digite a primeira nota: ");
            double nota1 = tec.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = tec.nextDouble();

            System.out.println("Digite a terceira nota: ");
            double nota3 = tec.nextDouble();

            System.out.println("Digite a quarta nota: ");
            double nota4 = tec.nextDouble();

            double nota = nota1 + nota2 + nota3 + nota4;

            double media = nota / 4;

            if (media >= 7) {
                System.out.println("Aluno " + name + " Aprovado!");
            } else if (media >= 6.6 && media <= 6.9) {
                System.out.println("Aluno: " + name + " Aprovado por arredondamento.");
            } else {
                System.out.println("Aluno: " + name + " Reprovado!");
            }
            System.out.printf("A Media é: %.2f", media);
        } catch (InputMismatchException e) {
            System.err.println("Algum caractere digitado errado!");
        }


    }
}