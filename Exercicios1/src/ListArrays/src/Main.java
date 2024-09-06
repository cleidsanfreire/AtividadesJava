import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i <= 10; i ++) {
            numeros.add(i);
        }

        System.out.println(numeros);

        //5 frutas
        System.out.println("*****------------*****");

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maça");
        frutas.add("Uva");
        frutas.add("Perá");
        frutas.add("Melancia");
        frutas.add("Goiaba");

        frutas.remove(2);

        System.out.println(frutas);

        System.out.println("*****------------*****");

        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("Valparaiso de goias");
        cidades.add("Brasilia");
        cidades.add("Gama");
        cidades.add("Jardim Goias");
        cidades.add("Samambaia");


        int num = cidades.indexOf(cidades.get(0));

        if (cidades.contains("Brasilia")) {
            System.out.println(num + " - " + cidades.get(1));
            System.out.println();
        } else {
            System.out.println("cidade não encontrada.");
        }
    }
}
