import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {

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

        System.out.println("Informe uma posição para saber o passageiro: ");
        int posicao = scan.nextInt(); 

        System.out.println("Passageiro: " +  passageiros.get(posicao));

        System.out.println("Quantidade de passageiros: " + passageiros.size());

    }
}
