package netExercicios.generics;

/*
Criando uma Classe Genérica

Praticar a criação de uma classe genérica simples que armazena um único valor de qualquer tipo.

Essa classe deve ter dois atributos genéricos: primeiro do tipo T e segundo do tipo U.

T getPrimeiro(): retorna o valor do primeiro elemento.
void setPrimeiro(T primeiro): define o valor do primeiro elemento.

U getSegundo(): retorna o valor do segundo elemento.
void setSegundo(U segundo): define o valor do segundo elemento.

Crie uma instância de Par que armazene um String e um Integer.

Defina os valores usando os métodos set.
Recupere e imprima os valores usando os métodos get.
*/

public class Atividade<T, U> {

    private T conteudoT;
    private U conteudoU;

    public void adicionar(T conteudoT, U conteudoU) {
        this.conteudoT = conteudoT;
        this.conteudoU = conteudoU;
    }

    public Atividade() {
    }

    public T getConteudoT() {
        return conteudoT;
    }

    public void setConteudoT(T conteudoT) {
        this.conteudoT = conteudoT;
    }

    public U getConteudoU() {
        return conteudoU;
    }

    public void setConteudoU(U conteudoU) {
        this.conteudoU = conteudoU;
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "conteudoT=" + conteudoT +
                ", conteudoU=" + conteudoU +
                '}';
    }

    public static void main(String[] args) {
        Atividade<Integer, String> atividade = new Atividade<>();

        atividade.adicionar(652, "Papum");
        System.out.println(atividade);

        System.out.println(atividade.getConteudoT() +", "+ atividade.getConteudoU());

        atividade.setConteudoT(123);
        atividade.setConteudoU("Opa");

        System.out.println(atividade.getConteudoT());
        System.out.println(atividade.getConteudoU());
    }
}
