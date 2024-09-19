package atividadesExtras.orientacaoObjetos.interfacee;

public class InterfaceMain {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();

        c1.depositar(500);
        c1.consultarSaldo();
        c1.sacar(150);
        c1.consultarSaldo();
    }
}
