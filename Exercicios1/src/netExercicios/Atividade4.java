package netExercicios;

import java.util.Scanner;

/*
Escreva um programa para determinar a quantidade de cavalos necessários para se
levantar uma massa de m quilogramas a uma altura de h metros em t segundos.
Considere cavalos = (m * h / t) / 745,6999
 */
public class Atividade4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double m,h,t,cavalos;

        System.out.println("Digite um quilogramas");
        m = tec.nextDouble();
        System.out.println("Digite uma altura");
        h = tec.nextDouble();
        System.out.println("Digite um tempo");
        t = tec.nextDouble();

        cavalos = (m * h / t) / 745.6999;

        System.out.printf("Sao necessarios %.2f cavalos", cavalos);
    }
}
