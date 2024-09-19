package atividadesExtras.metodosConstrutores;

/*
3. Construtores Simples: Crie uma classe Pessoa com atributos
como nome, idade e profissão. Implemente um construtor que
inicialize esses atributos e um método para exibir os detalhes da
pessoa.
4. Construtores sobrecarregados: Na classe Pessoa, crie diferentes
construtores, um sem parâmetros, outro apenas com o nome, e outro
com todos os atributos. Faça com que cada construtor chame o outro
utilizando o comando this().
 */

public class Pessoa {
    private String name;
    private String profissao;
    private int idade;

    public Pessoa() {
        this("Desconhecido","Desconhecido",0);
    }

    public Pessoa(String name) {
        this.name = name;
        this.profissao = "Desconhecida";
        this.idade = 0;
    }

    public Pessoa(String name, String profissao, int idade) {
        this.name = name;
        this.profissao = profissao;
        this.idade = idade;
    }

    public String exibirInfo() {
        return "Nome: " + name + ", Profissão: " + profissao + ", Idade: " + idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", profissao='" + profissao + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Freire","Backend",24);

        System.out.println(p1);
    }
}