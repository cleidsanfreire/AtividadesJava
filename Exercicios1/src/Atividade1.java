import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um numero qualquer.");
        double num = tec.nextInt();

        double reajuste = num * 0.05;

        double res = reajuste + num;

        System.out.println(res);
    }
}
