package atividadesExtras.orientacaoObjetos.encapsulamento;

/*
10.Encapsulamento: Crie uma classe Produto com atributos privados,
como nome e preco. Implemente métodos get e set para esses
atributos, garantindo que o preço nunca seja negativo.
 */
public class EncapsulamentoMain {
    public static void main(String[] args) {
        Produto p1 = new Produto("dsadas",-152);

        System.out.println(p1);
    }
}
