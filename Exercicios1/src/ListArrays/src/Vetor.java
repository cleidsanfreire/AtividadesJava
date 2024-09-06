import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(15);
        num.add(23);
        num.add(415);
        num.add(55);

        num.forEach((n) -> {System.out.print(n + " | ");});
    }
}
