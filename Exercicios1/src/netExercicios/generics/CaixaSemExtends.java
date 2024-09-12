package netExercicios.generics;

public class CaixaSemExtends<T> {

    private T conteudo;

    public void adcionar(T conteudo) {
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
        return "conteudo: " + conteudo;
    }
}
