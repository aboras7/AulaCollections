package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        List<Integer> numerosList = new ArrayList<>();

        numerosList.add(2);
        numerosList.add(5);
        numerosList.add(1);
        numerosList.add(3);
        numerosList.add(4);
        numerosList.add(9);
        numerosList.add(7);
        numerosList.add(8);
        numerosList.add(10);
        numerosList.add(6);

        System.out.println("Digite o número que você deseja encontrar: ");
        int num = leia.nextInt();
        int posicao = numerosList.indexOf(num);
        if (posicao != -1) {
            System.out.println("O número " + num + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + num + " não foi encontrado!");
        }
    }
}