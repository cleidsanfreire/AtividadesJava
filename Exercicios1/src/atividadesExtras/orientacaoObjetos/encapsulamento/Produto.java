package atividadesExtras.orientacaoObjetos.encapsulamento;

public class Produto {
    private String nome;
    private double price;

    public Produto() {
    }

    public Produto(String name, double price) {
        this.nome = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", price=" + price +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setName(String name) {

        this.nome = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            price = 0;
        }
        this.price = price;
    }
}
