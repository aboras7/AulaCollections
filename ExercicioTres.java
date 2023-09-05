package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Set<Integer> setNumeros = new HashSet<Integer>();
        int num;

        System.out.println("Digite 10 valores inteiros não repetidos: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            num = leia.nextInt();
            setNumeros.add(num);
        }
        Iterator<Integer> isetNumeros = setNumeros.iterator();
        System.out.println("Listar dados do Set: ");
        while (isetNumeros.hasNext()) {
            System.out.print(isetNumeros.next()+" ");
        }
    }
}