import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
       try {
           Scanner tec = new Scanner(System.in);

           System.out.println("Digite sua altura: ");
           double altura = tec.nextDouble();

           System.out.println("Digite seu peso");
           double peso = tec.nextDouble();

           double imc = peso / (altura * 2);

           if (imc < 18.5) {
               System.out.println("Abaixo do peso");
           } else if (imc >= 18.6 && imc <= 24.9) {
               System.out.println("Peso ideal (parabéns)");
           }else if (imc >= 25 && imc <= 29.9) {
               System.out.println("Levemente acima do peso");
           }else if (imc >= 30 && imc <= 34.9) {
               System.out.println("Obesidade grau I");
           } else if (imc >= 35 && imc <= 39.9) {
               System.out.println("Obesidade grau II (severa)");
           }else {
               System.out.println("Obesidade grau III (mórbida)");
           }
       } catch (InputMismatchException e) {
           System.err.println("Algum caractere digitado errado!");
       }
    }
}
