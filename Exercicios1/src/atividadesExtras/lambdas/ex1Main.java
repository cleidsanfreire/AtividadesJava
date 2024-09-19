package atividadesExtras.lambdas;

public class ex1Main {
    public static void main(String[] args) {
        ex1 soma = (a, b) -> a + b;
        ex1 subtracao = (a,b) -> a - b;
        ex1 multiplicacao = (a,b) -> a * b;

        System.out.println(soma.executar(1,5));
        System.out.println(subtracao.executar(5,1));
        System.out.println(multiplicacao.executar(1,5));
    }
}
