import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Double> notas = new ArrayList<>();

        notas.add(9.0);
        notas.add(8.5);
        notas.add(9.5);
        notas.add(7.0);
        notas.add(6.0);

        System.out.println("===NOTAS===");

        for (int i = 0; i < notas.size(); i++) {
            System.out.println(notas.get(i));
        }

        System.out.println("Informe uma posição de 0" + " até " + (notas.size() -1) + " para alterar uma nota: ");
        int posicao = scan.nextInt();

        System.out.println("Informe a nova nota: ");
        double novaNota = scan.nextDouble();

        notas.set(posicao, novaNota);

        System.out.println("===NOTAS ATUALIZADAS===");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println(notas.get(i));
        }

        System.out.println("Informe uma posição de 0" + " até " + (notas.size() -1) + " para remover uma nota: ");
        int removerNota = scan.nextInt();

        notas.remove(removerNota);

        System.out.println("===NOTAS ATUALIZADAS===");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println(notas.get(i));
        }

        System.out.println("Total de notas: " + notas.size());
    }
}
