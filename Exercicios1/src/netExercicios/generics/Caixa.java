package netExercicios.generics;

public class Caixa<T extends Number> {

    private T conteudo;

    public void adicionarConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "conteudo " + conteudo;
    }
}
