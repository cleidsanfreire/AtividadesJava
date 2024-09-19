package atividadesExtras.orientacaoObjetos.polimorfismo;

public class Moto extends Veiculo {
    int velocity;
    public Moto() {
    }

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        velocity += 10;
    }

    public void ligar(){
        System.out.println("Moto ligando");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("A Velocidade da moto é: " + getVelocity() + "Km/h");
    }

    public int getVelocity() {
        return velocity;
    }
}
