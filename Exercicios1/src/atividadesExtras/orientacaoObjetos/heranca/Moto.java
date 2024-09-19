package atividadesExtras.orientacaoObjetos.heranca;

public class Moto extends Veiculo{
    public Moto() {
    }

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void ligar(){
        System.out.println("Moto ligando");
    }
}
