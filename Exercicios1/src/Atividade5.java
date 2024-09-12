import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        try{
            Scanner tec = new Scanner(System.in);

            System.out.println("Digite a primeira nota: ");
            double nota1 = tec.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = tec.nextDouble();

            System.out.println("Digite a terceira nota: ");
            double nota3 = tec.nextDouble();

            double nota = nota1 + nota2 + nota3;

            double media = nota / 3;
            System.out.printf("A Media é: %.2f", media);
        } catch (InputMismatchException e) {
            System.err.println("Algum caractere digitado errado!");
        }
    }
}
