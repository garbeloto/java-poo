package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaFilmes {
    public static void main(String[] args) { //Exercício 5
        Scanner scan = new Scanner(System.in);
        ArrayList <String> filmes = new ArrayList<>();

        filmes.add("Imagine Me and You");
        filmes.add("Obsession");
        filmes.add("But I´m A Cheerleader");
        filmes.add("Thunderbolts");
        filmes.add("Girls Like Girls");

        System.out.println("===FILMES===");
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println(filmes.get(i));
        }

        System.out.println("Informe uma posição de 0" + " até " + (filmes.size() -1) + " para remover um filme: ");
        int removerFilme = scan.nextInt();

        filmes.remove(removerFilme);

        System.out.println("===FILMES ATUALIZADOS===");
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println(filmes.get(i));
        }

    }
}
