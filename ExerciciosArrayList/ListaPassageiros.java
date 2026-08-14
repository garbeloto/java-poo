package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaPassageiros {
    public static void main(String[] args) { //Exercício 6
        Scanner scan = new Scanner(System.in);
        ArrayList <String> passageiros = new ArrayList<>();

        passageiros.add("Rafaela");
        passageiros.add("Gabriela");
        passageiros.add("Maria");
        passageiros.add("José");
        passageiros.add("Pedro");

        System.out.println("===Passageiros===");

        for (int i = 0; i < passageiros.size(); i++) {
            System.out.println(passageiros.get(i));
        }

        System.out.println("Adicione um novo passageiro: ");
        String novoPassageiro = scan.nextLine();

        passageiros.add(novoPassageiro);

        System.out.println("Informe uma posição de 0" + " até " + (passageiros.size() -1) + " para remover um passageiro: ");
        int removerPassageiro = scan.nextInt();

        passageiros.remove(removerPassageiro);

        System.out.println("===Passageiros Atualizados===");

        for (int i = 0; i < passageiros.size(); i++) {
            System.out.println(passageiros.get(i));
        }
    }
}
