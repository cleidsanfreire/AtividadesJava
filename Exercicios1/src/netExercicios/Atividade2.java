package netExercicios;
/*
 Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser
 coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo).

 Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são necessários
 para cobrir a parede dada.
 */

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double hp, lp, ha, la, qtd;

        System.out.println("Digite a Altura da parede");
        hp = tec.nextDouble();
        System.out.println("Digite a Largura da parede");
        lp = tec.nextDouble();
        System.out.println("Digite a Altura do azulejo");
        ha = tec.nextDouble();
        System.out.println("Digite a Largura do azulejo");
        la = tec.nextDouble();

        qtd = (hp * lp) / (ha * la);

        System.out.println("A quantidade de Azulejos necessarios será de: " + qtd);
    }
}
