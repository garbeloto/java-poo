import java.util.Scanner;

public class Desafio01Metodos { //Rafaela Bittencourt Garbeloto
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do voo: ");
        String nomeVoo = scan.nextLine();

        System.out.println("Informe a quantidade de passageiros: ");
        int qtdPassageiros= scan.nextInt();

        System.out.println("Informe o peso total da carga transportada (em kg): ");
        double pesoCarga= scan.nextDouble();

        System.out.println("Informações cadastradas com sucesso!");

        int opcao = 0;

        do {
            System.out.println(" ");
            System.out.println("Qual opção deseja selecionar?");
            System.out.println("1 - Calcular Peso Total da Aeronave");
            System.out.println("2 - Verificar Situação para Decolagem");
            System.out.println("3 - Exibir Resumo do Voo");
            System.out.println("4 - Encerrar Sistema");
            opcao = scan.nextInt();

            double pesoTotal = calcularPesoTotal(qtdPassageiros, pesoCarga);
            String situacao = verificarSituacao(pesoTotal);

            if (opcao == 1) {
                //Calcular Peso Total da Aeronave
                System.out.println("Peso total da aeronave: " + pesoTotal);
            } else if (opcao == 2 ) {
                //Verificar Situação para Decolagem
                System.out.println("Situação: " + situacao);
            } else if (opcao == 3) {
                //Exibir Resumo do Voo
                exibirResumo(nomeVoo, qtdPassageiros, pesoCarga, pesoTotal, situacao);
            }

            
        } while (opcao != 4);
    }

    public static double calcularPesoTotal(int qtdPassageiros, double pesoCarga){
        return pesoCarga + (qtdPassageiros * 80);
    }

    public static String verificarSituacao(double pesoTotalAeronave){
        if (pesoTotalAeronave > 10000) {
            return "Decolagem não autorizada!";
        } else if (pesoTotalAeronave >= 8001 && pesoTotalAeronave <= 10000) {
            return "Atenção: Peso elevado!";
        } else {
            return "Decolagem Liberada!";
        }
    } 

    public static void exibirResumo(String nomeVoo, int qtdPassageiros, double pesoCarga, double pesoTotal, String situacao){
        System.out.println("===== CONTROLE DE DECOLAGEM =====");
        System.out.println("Voo: " + nomeVoo);
        System.out.println("Passageiros: " + qtdPassageiros);
        System.out.println("Carga: "+ pesoCarga);
        System.out.println("Peso Total: "+ pesoTotal);
        System.out.println("Situação: "+ situacao);
        System.out.println(" ");
    }

    public static void mensagemFinal(){
        System.out.println("Sistema encerrado com sucesso!");
        System.out.println("=================================");
    }

}
