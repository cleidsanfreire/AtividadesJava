package atividadesExtras.orientacaoObjetos.polimorfismo;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar() {

    }


    public void exibirInfo() {
        System.out.println("Marca: " + marca + " Ano: " + ano + " Modelo: "+ modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
