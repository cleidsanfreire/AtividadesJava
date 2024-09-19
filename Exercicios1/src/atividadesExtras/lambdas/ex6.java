package atividadesExtras.lambdas;
/*
15.Uso de Generics: Crie uma classe Caixa<T> que possa armazenar
um objeto de qualquer tipo. Adicione métodos para inserir e retirar o
objeto da caixa. Crie uma instância de Caixa para diferentes tipos de
dados (por exemplo, Caixa<Integer>, Caixa<String>).
 */
public class ex6<T> {

    private T conteudo;

    public void addConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public T retirarConteudo() {
        T retirarConteudo = conteudo;
        conteudo = null;
        return retirarConteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "ex6{" +
                "conteudo=" + conteudo +
                '}';
    }

    public static void main(String[] args) {
        ex6<Integer> caixaInteger = new ex6();
        caixaInteger.addConteudo(125);
        System.out.println(caixaInteger);

        ex6<String> caixaString = new ex6();
        caixaString.addConteudo("caixaString");
        System.out.println(caixaString);

        ex6<Double> caixaDouble = new ex6();
        caixaDouble.addConteudo(1.5);
        System.out.println(caixaDouble);

        Double retirar = caixaDouble.retirarConteudo();
        System.out.println(caixaDouble);
    }


}
