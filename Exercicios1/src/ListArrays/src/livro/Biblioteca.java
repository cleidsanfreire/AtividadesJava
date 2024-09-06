package livro;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void add(String titulo,String autor,String anoPub) {
        livros.add(new Livro(titulo,autor,anoPub));
    }

    public void remover(String titulo) {
        ArrayList<Livro> removeLivro = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    removeLivro.add(l);
                }
            };
        }
        livros.removeAll(removeLivro);
    }

    public void listar() {
        System.out.println(livros);
    }

    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        b.listar();
        b.add("Ola","Eu","2025");
        b.listar();
        b.remover("Ola");
        b.listar();

    }
}
