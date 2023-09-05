package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Set<Integer> numerosSet = new HashSet<Integer>();

        numerosSet.add(2);
        numerosSet.add(5);
        numerosSet.add(1);
        numerosSet.add(3);
        numerosSet.add(4);
        numerosSet.add(9);
        numerosSet.add(7);
        numerosSet.add(8);
        numerosSet.add(10);
        numerosSet.add(6);

        System.out.println("Digite o número que você deseja encontrar: ");
        int num = leia.nextInt();
        if (numerosSet.contains(num)) {
            System.out.println("O número " + num + " foi encontrado!");
        } else {
            System.out.println("O número "+ num+ " não foi encontrado!");
        }
    }
}