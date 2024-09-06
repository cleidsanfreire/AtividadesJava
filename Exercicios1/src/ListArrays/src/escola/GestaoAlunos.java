package escola;

import java.util.ArrayList;
import java.util.List;

public class GestaoAlunos {
    private List<Aluno> alunos; //
    private List<Double> notas;

    /*Working with the Student class.*/
    // Creating constructors to initialize the lists as empty.
    public GestaoAlunos() {
        this.alunos = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

    // Method to add a student to the list of students
    public void addAluno(String name, int idade) {
        alunos.add(new Aluno(name, idade));
    }

    // Method to remove a student from the list of students.
    public void removerAluno(String name) {
        alunos.removeIf(aluno -> aluno.getName().equalsIgnoreCase(name));
    }

    //Method to search for students by name.
    public Aluno pesquisarPorNome(String name) {
        Aluno nome = null;
        if (!alunos.isEmpty()) {
            for (Aluno a : alunos) {
                if (a.getName().equalsIgnoreCase(name)) {
                    nome = a;
                    break;
                }
            }
        }
        return nome;
    }

    // Method to list all students present in the list.
    public void listar() {
        System.out.println(alunos);
    }

    /*Working with the list of grades.*/
    //Method to add grades to the list of grades.
    public void addNotas(double nota) {
        notas.add(nota);
    }

    //Method to calculate the grades and return the result divided by the total number of grades.
    public Double calcMedia() {
        double soma = 0;
        if (!notas.isEmpty()) {
            for (Double n : notas) {
                soma += n;
            }
        }
        return soma / notas.size();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }


    public static void main(String[] args) {
        //Instantiating the GestaoAlunos object.
        GestaoAlunos g = new GestaoAlunos();

        g.listar();

        g.addAluno("Naruto", 24);
        g.addAluno("Sasuke", 25);
        g.addAluno("Sai", 21);
        g.addAluno("Shikamaru", 25);

        g.listar();

        g.removerAluno("Sai");

        g.listar();


    }
}