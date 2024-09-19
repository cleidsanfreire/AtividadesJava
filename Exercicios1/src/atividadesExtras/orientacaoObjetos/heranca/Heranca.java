package atividadesExtras.orientacaoObjetos.heranca;

/*
Polimorfismo: Na hierarquia de classes criada no exercício anterior,
crie um método acelerar() em Veiculo, que será sobrescrito nas
classes Carro e Moto com implementações específicas.
 */
public class Heranca {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("BMW");
        carro.setAno(2024);
        carro.setModelo("201");
        carro.ligar();
        System.out.println(carro);

        Moto moto = new Moto("Suzuki","300",2020);
        moto.ligar();

        System.out.println(moto);
    }
}
