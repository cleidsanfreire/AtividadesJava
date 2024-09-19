package atividadesExtras.metodosConstrutores;
/*
Métodos Estáticos:
Crie uma classe ConversorTemperatura com métodos estáticos para converter Celsius em Fahrenheit e Fahrenheit
em Celsius.

Teste esses métodos sem instanciar objetos.
*/

public class ConversorTemperatura {

    public static void convertCF(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(fahrenheit);
    }

    public static void convertFC(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);
    }

    public static void main(String[] args) {
        convertCF(50);
        convertFC(22);
    }
}
