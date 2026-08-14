package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCidades { //Exercício 2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> cidades = new ArrayList<>();

        cidades.add("Tubarão");
        cidades.add("Jaguaruna");
        cidades.add("Laguna");
        cidades.add("Capivari de Baixo");
        cidades.add("Criciúma");

        System.out.println("===CIDADES===");
        for (int i = 0; i < cidades.size(); i++) {
            System.out.println(cidades.get(i));
        }

        System.out.println(" ");

        System.out.println("Informe uma posição de 0" + " até " + (cidades.size() -1) + " consultar uma cidade");
        int posicao = scan.nextInt();

        System.out.println("Cidade: " + cidades.get(posicao));

    }
}
