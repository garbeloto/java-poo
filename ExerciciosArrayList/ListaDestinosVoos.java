package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDestinosVoos { //Exercício 9
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> destinos = new ArrayList<>();

        destinos.add("São Paulo - Guarulhos");
        destinos.add("São Paulo - Congonhas");
        destinos.add("Florianópolis");

        System.out.println("====DESTINOS DE VOO====");
        for (int i = 0; i < args.length; i++) {
            System.out.println(destinos.get(i));
        }

        System.out.println("Adicione mais um destino: ");
        String novoDestino1 = scan.next();

        System.out.println("Adicione mais um destino: ");
        String novoDestino2 = scan.next();

        System.out.println("Adicione mais um destino: ");
        String novoDestino3 = scan.next();

        destinos.add(novoDestino1);
        destinos.add(novoDestino2);
        destinos.add(novoDestino3);

        System.out.println("====DESTINOS DE VOO====");
        for (int i = 0; i < destinos.size(); i++) {
            System.out.println(destinos.get(i));
        }

        System.out.println("Quantidade total de destinos cadastrados: " + destinos.size());
    }
}
