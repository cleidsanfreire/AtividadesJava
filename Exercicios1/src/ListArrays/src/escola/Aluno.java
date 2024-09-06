package escola;

public class Aluno {

    //Attributes
    private String name;
    private int idade;

    //Constructor
    public Aluno(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    // Method Override toString
    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                '}';
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}