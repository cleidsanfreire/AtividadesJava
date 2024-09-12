package netExercicios.generics;

public class conceitoGenerics {
    public static void main(String[] args) {
        // Fixando que o generics que eu quero seja com numeros
        System.out.println("Com extends");

        Caixa<Integer> caixaInteiro = new Caixa<>();
        caixaInteiro.adicionarConteudo(123);

        System.out.println("Adicionando o numero do T(type) Integer: " + caixaInteiro);

        Caixa<Double> caixaDouble = new Caixa<>();

        caixaDouble.adicionarConteudo(152.65);

        System.out.println("Adicionando o numero do T(type) Double: " + caixaDouble);

        // Trabalhando com liberdade com o generics
        System.out.println("\nSem extends");
        CaixaSemExtends<String> caixaSemExtendsString = new CaixaSemExtends<>();
        caixaSemExtendsString.adcionar("Olá, Mundo!");
        System.out.println("Adicionando a String do T(type) String: " + caixaSemExtendsString);

        CaixaSemExtends<Integer> caixaSemExtendsInteger = new CaixaSemExtends<>();
        caixaSemExtendsInteger.adcionar(123);
        System.out.println("Adicionando o numero do T(type) Integer: " + caixaSemExtendsInteger);

        CaixaSemExtends<Double> caixaSemExtendsDouble = new CaixaSemExtends<>();
        caixaSemExtendsDouble.adcionar(123.652);
        System.out.println("Adicionando o numero do T(type) Double: " + caixaSemExtendsDouble);

    }
}
