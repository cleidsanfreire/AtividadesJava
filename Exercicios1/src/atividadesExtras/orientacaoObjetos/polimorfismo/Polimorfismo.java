package atividadesExtras.orientacaoObjetos.polimorfismo;

/*
7. Polimorfismo: Na hierarquia de classes criada no exercício anterior,
crie um método acelerar() em Veiculo, que será sobrescrito nas
classes Carro e Moto com implementações específicas.
 */
public class Polimorfismo {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("BMW");
        carro.setAno(2024);
        carro.setModelo("201");
        carro.ligar();
        carro.acelerar();
        carro.exibirInfo();

        Moto moto = new Moto("Suzuki","300",2020);
        moto.ligar();
        moto.acelerar();
        moto.acelerar();
        moto.exibirInfo();
    }
}
