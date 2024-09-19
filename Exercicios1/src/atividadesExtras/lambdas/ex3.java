package atividadesExtras.lambdas;

import java.util.ArrayList;
import java.util.List;

/*
13.Mapeamento com Stream API: Crie uma lista de objetos Produto e
use a Stream API para extrair e imprimir apenas os nomes dos
produtos cujos preços sejam superiores a um determinado valor.
 */
public class ex3 {
    private List<Produtos> produtosList;

    public ex3() {
        this.produtosList = new ArrayList<>();
    }

    public void addProduct(String name, Double price) {
        produtosList.add(new Produtos(name,price));
    }

    public List<Produtos> imprimirProdutosSuperiores(double price) {
        List<Produtos> produtosSelecionados;

        produtosSelecionados = produtosList.stream().filter(s -> s.getPrice() > price).toList();

        return produtosSelecionados;
    }

    public static void main(String[] args) {
        ex3 p = new ex3();

        p.addProduct("S",25d);
        p.addProduct("D",5d);
        p.addProduct("A",35d);
        p.addProduct("Q",15d);
        p.addProduct("J",20d);

        System.out.println(p.imprimirProdutosSuperiores(20));
    }
}
