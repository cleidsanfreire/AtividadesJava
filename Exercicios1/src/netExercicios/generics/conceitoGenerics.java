package netExercicios.generics;

public class conceitoGenerics {
    public static void main(String[] args) {
        Caixa<Integer> caixaInteiro = new Caixa<>();
        caixaInteiro.adicionarConteudo(123);

        System.out.println("Adicionando o numero: " + caixaInteiro);

        Caixa<Double> caixaDouble = new Caixa<>();

        caixaDouble.adicionarConteudo(152.65);

        System.out.println(caixaDouble);

        CaixaSemExtends<String> caixaString = new CaixaSemExtends<>();
        caixaString.adcionar("Olá, Mundo!");
        System.out.println(caixaString);

    }
}
