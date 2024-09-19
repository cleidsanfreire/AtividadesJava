package atividadesExtras.orientacaoObjetos.heranca;

public class Carro extends Veiculo{

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void ligar(){
        System.out.println("Carro Ligando");
    }
}
