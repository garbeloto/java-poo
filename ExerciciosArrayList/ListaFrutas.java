package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaFrutas { //Exercício 1
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> frutas = new ArrayList<>();

        frutas.add("Maçã");
        frutas.add("Uva");
        frutas.add("Laranja");
        frutas.add("Mamão");
        frutas.add("Maracujá");


        System.out.println("===Frutas===");

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }

        System.out.println(" ");
        System.out.println("Adicione uma nova fruta: ");
        String novaFruta = scan.nextLine();

        frutas.add(novaFruta);

        System.out.println(" ");
        System.out.println("===Frutas Atualizadas===");

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }

        System.out.println(" ");
        System.out.println("Quantidade de frutas: " + frutas.size());


    }
}
