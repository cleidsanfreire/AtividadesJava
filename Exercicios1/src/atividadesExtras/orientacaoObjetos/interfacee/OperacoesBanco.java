package atividadesExtras.orientacaoObjetos.interfacee;
/*
Interface: Crie uma interface chamada OperacoesBanco com métodos
para depositar, sacar e consultarSaldo. Implemente essa interface
em uma classe ContaBancaria.
 */
public abstract interface OperacoesBanco {

    public void depositar(double valor);
    public void sacar(double valor);
    public void consultarSaldo();

}
