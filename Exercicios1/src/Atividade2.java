import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Entre com um valor [true/false]");
        boolean valor1 = tec.nextBoolean();

        System.out.println("Entre com um valor [true/false]");
        boolean valor2 = tec.nextBoolean();

        if (valor1 == valor2) {
            if (valor1) {
                System.out.println("Ambos sao verdadeiros");
            } else {
                System.out.println("Ambos sao falsos");
            }
        } else {
            System.out.println("Um e verdadeiro o outro e falso");


        }

    }
}

