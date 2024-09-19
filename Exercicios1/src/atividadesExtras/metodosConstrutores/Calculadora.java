package atividadesExtras.metodosConstrutores;

/*

1. Criação de Classe e Métodos: Crie uma classe
chamada Calculadora com métodos para somar, subtrair, multiplicar e
dividir dois números. Cada método deve receber dois parâmetros e
retornar o resultado da operação.

2. Sobrecarga de Métodos: Na classe Calculadora, sobrecarregue os
métodos de forma que eles aceitem diferentes tipos de parâmetros,
como inteiros, decimais e arrays de números.

*/

public class Calculadora {
    //Somar e Sobrecarga
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    public int somar(int[] num) {
        int soma = 0;
        for (int a : num) {
            soma += a;
        }
        return soma;
    }

    public double somar(double[] num) {
        double soma = 0;
        for (double a : num) {
            soma += a;
        }
        return soma;
    }

    //Subtrair e Sobrecarga

    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public int subtrair(int[] num) {
        int subtrair = 0;
        for (int a : num) {
            subtrair -= a;
        }
        return subtrair;
    }

    public double subtrair(double[] num1) {
        double subtrair = 0d;
        for (double a : num1) {
            subtrair -= a;
        }
        return subtrair;
    }

    //Multiplicar e Sobrecarga
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public int multiplicar(int[] num) {
        int multiplicar = 1;
        for (int a : num){
            multiplicar *= a;
        }
        return multiplicar;
    }

    public double multiplicar(double[] num) {
        double multiplicar = 0d;
        for (double a : num) {
            multiplicar *= a;
        }
        return multiplicar;
    }

    //Dividir e Sobrecarga
    public int dividir(int num1, int num2) {
       return num1 / num2;
    }

    public double dividir(double num1, double num2) {
        return num1 / num2;
    }

    public int dividir(int[] num) {
        int dividir = 2;
        for (int a : num) {
            dividir /= a;
        }
        return dividir;
    }
    public double dividir(double[] num) {
        double dividir = 1;
        for (double a : num) {
            dividir /= a;
        }
        return dividir;
    }


    public static void main(String[] args) {
        Calculadora calc = new Calculadora();


        //Somar
        System.out.println("****------Somar------****");
        System.out.println("Somando numeros Inteiros: " + calc.somar(5,6));
        System.out.println("Somando numeros Flutuante: " + calc.somar(5.9,6.8));
        System.out.println("Somando numeros Inteiros com array: " + calc.somar(new int[]{5,6,9,8,5}));
        System.out.println("Somando numeros Inteiros com array: " + calc.somar(new double[]{2.5,6.3,5.2,4.5}));

        //Subtrair
        System.out.println("\n****------Subtrair------****");
        System.out.println("Subtraindo numeros Inteiros: " + calc.subtrair(5,6));
        System.out.println("Subtraindo numeros Flutuante: " + calc.subtrair(5.9,6.8));
        System.out.println("Subtraindo numeros Inteiros com array: " + calc.subtrair(new int[]{5,6,9,8,5}));
        System.out.println("Subtraindo numeros Inteiros com array: " + calc.subtrair(new double[]{2.5,6.3,5.2,4.5}));

        //Multiplicar
        System.out.println("\n****------Multiplicar------****");
        System.out.println("Multiplicando numeros Inteiros: " + calc.multiplicar(5,6));
        System.out.println("Multiplicando numeros Flutuante: " + calc.multiplicar(5.9,6.8));
        System.out.println("Multiplicando numeros Inteiros com array: " + calc.multiplicar(new int[]{5,6,9,8,5}));
        int soma = calc.multiplicar(new int[]{1,5,6,7,8,2});
        System.out.println(soma);
        System.out.println("Multiplicando numeros Inteiros com array: " + calc.multiplicar(new double[]{2.5,6.3,5.2,4.5}));

        //Dividir
        System.out.println("\n****------Dividir------****");
        System.out.println("Dividindo numeros Inteiros: " + calc.dividir(5,25));
        System.out.println("Dividindo numeros Flutuante: " + calc.dividir(5.9,6.8));
        System.out.println("Dividindo numeros Inteiros com array: " + calc.dividir(new int[]{10,5}));
        System.out.println("Dividindo numeros Inteiros com array: " + calc.dividir(new double[]{20,5}));


    }

}
