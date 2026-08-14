package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaFuncionarios {//Exercício 8
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> funcionarios = new ArrayList<>();

        funcionarios.add("Rafaela");
        funcionarios.add("Gabriela");
        funcionarios.add("Maria");
        funcionarios.add("José");
        funcionarios.add("Pedro");

        System.out.println("====FUNCIONÁRIOS CADASTRADOS====");
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i));
        }

        System.out.println("Informe uma posição de 0-" + (funcionarios.size() - 1) + " para remover um funcionários: ");
        int removerFuncionario = scan.nextInt();

        funcionarios.remove(removerFuncionario);
        System.out.println("====FUNCIONÁRIOS CADASTRADOS====");
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i));
        }
    }
}
