package atividadesExtras.orientacaoObjetos.interfacee;

public class ContaBancaria implements OperacoesBanco {
    double saldo;

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
        System.out.println("Valor depositado: " + valor);
    }

    @Override
    public void sacar(double valor) {
        if (saldo > 0 && valor <= saldo) {
            saldo -= valor;
        }
        System.out.println("Valor retirado: " + valor);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é de: " + saldo);
    }
}
