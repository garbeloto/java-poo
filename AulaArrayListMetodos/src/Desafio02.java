import java.util.ArrayList;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {  //Rafaela Bittencourt Garbeloto: Desafio ArrayList + Métodos
        ArrayList<String> jogadores = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("======Sistema Gestão de Elenco de Futebol======");
            System.out.println("1 - Cadastrar jogador");
            System.out.println("2 - Listar jogadores");
            System.out.println("3 - Alterar jogador");
            System.out.println("4 - Remover jogador");
            System.out.println("5 - Consultar jogador");
            System.out.println("6 - Informar quantidade de jogadores");
            System.out.println("7 - Substituir jogador");
            System.out.println("8 - Encerrar sistema");
            opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("Informe o nome do jogador: ");
                String jogador = scan.next();
                
                adicionarJogador(jogadores, jogador);
            } else if (opcao == 2) {
                System.out.println("Lista de jogadores: ");
                listarJogadores(jogadores);

            } else if (opcao == 3) {
                System.out.println("Informe uma posição de 0" + " até " + (jogadores.size() -1) + " para alterar um jogador: ");
                int posicaoAlterar = scan.nextInt();

                System.out.println("Informe o nome do novo jogador: ");
                String novoJogador = scan.next();

                alterarJogador(jogadores, posicaoAlterar, novoJogador);

            } else if (opcao == 4) {
                System.out.println("Informe uma posição de 0" + " até " + (jogadores.size() -1) + " para remover um jogador: ");
                int posicaoRemover = scan.nextInt();

                removerJogador(jogadores, posicaoRemover);

            } else if (opcao == 5) {
                System.out.println("Informe uma posição de 0" + " até " + (jogadores.size() -1) + " para consultar um jogador: ");
                int posicaoConsultar = scan.nextInt();

                System.out.println("Jogador consultado: " + consultarJogador(jogadores, posicaoConsultar));

            } else if (opcao == 6) {
                System.out.println("Quantidade de jogadores: " + quantidadeJogadores(jogadores));

            } else if (opcao == 7) {
                System.out.println("Informe uma posição de 0" + " até " + (jogadores.size() -1) + " para substituir um jogador: ");
                int posicaoSubstituir = scan.nextInt();

                System.out.println("Informe o nome do jogador substituto: ");
                String jogadorSubstituto = scan.next();

                substituirJogador(jogadores, posicaoSubstituir, jogadorSubstituto);
            } else {
                mensagemFinal();
            }

        } while (opcao != 8);
    }

    public static void adicionarJogador(ArrayList<String> jogadores, String jogador){
        jogadores.add(jogador);
    }

    public static void listarJogadores(ArrayList<String> jogadores){
        for (int i = 0; i < jogadores.size(); i++) {
            System.out.println("- " + jogadores.get(i));
        }
    }

    public static void alterarJogador(ArrayList<String> jogadores, int posicaoAlterar, String novoJogador){
        jogadores.set(posicaoAlterar, novoJogador);
    }

    public static void removerJogador(ArrayList<String> jogadores, int posicaoRemover){
        jogadores.remove(posicaoRemover);
    }

    public static String consultarJogador(ArrayList<String> jogadores, int posicaoConsultar){
        return jogadores.get(posicaoConsultar);
    }

    public static int quantidadeJogadores(ArrayList<String> jogadores){
        return jogadores.size();
    }

    public static void substituirJogador(ArrayList<String> jogadores, int posicaoSubstituir, String jogadorSubstituto){
        jogadores.set(posicaoSubstituir, jogadorSubstituto);
    }

    public static void mensagemFinal(){
        System.out.println("Sistema encerrado!");
    }
}
