package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaPrecos {
    public static void main(String[] args) { //Exercício 7
        Scanner scan = new Scanner(System.in);
        ArrayList <Double> precos = new ArrayList<>();

        precos.add(20.40);
        precos.add(10.80);
        precos.add(5.90);
        precos.add(2.98);
        precos.add(4.40);


        System.out.println("===PREÇOS===");
        for (int i = 0; i < precos.size(); i++) {
            System.out.println(precos.get(i));
        }

        System.out.println("Informe uma posição de 0" + " até " + (precos.size() -1) + " editar um preço de produto");
        int posicao = scan.nextInt();

        System.out.println("Informe o novo preços");
        Double novoPreco = scan.nextDouble();

        precos.set(posicao, novoPreco);

        System.out.println("===PREÇOS ATUALIZADOS===");
        for (int i = 0; i < precos.size(); i++) {
            System.out.println(precos.get(i));
        }
    }
}
