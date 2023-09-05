package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String cor;
        ArrayList<String> lista = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a " + (i + 1) + "° cor: ");
            cor = leia.nextLine();
            lista.add(cor);
        }
        System.out.println(lista);
        lista.sort(null);
        System.out.println(lista);
    }
}
