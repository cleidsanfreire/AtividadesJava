package atividadesExtras.orientacaoObjetos.polimorfismo;

public class Carro extends Veiculo {
    int velocity;
    public Carro() {
    }

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        velocity += 10;
    }

    public void ligar(){
        System.out.println("Carro Ligando");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Velocidade do Carro: " + getVelocity() + "Km/h");
    }

    public int getVelocity() {
        return velocity;
    }
}
