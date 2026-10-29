import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        do {
            int opcao= 0;
            System.out.println("\n--- MOTOR DE OPERAÇÕES FINANCEIRAS ---");
            System.out.println("1. Registrar Renda Fixa");
            System.out.println("2. Registrar Renda Variável");
            System.out.println("3. Registrar Operação Internacional");
            System.out.println("4. Registrar Investimento Internacional");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();


            if (opcao == 1) {
                System.out.println("\n-- Renda Fixa --");
                InvestimentoRendaFixa rf = new InvestimentoRendaFixa("RF01", 1000.0, 0.05);
                rf.exibirDadosOperacao();
                System.out.printf("Rendimento: R$ %.2f\n", rf.calcularRendimento());
            } 
            else if (opcao == 2) {
                System.out.println("\n-- Renda Variável --");
                InvestimentoRendaVariavel rv = new InvestimentoRendaVariavel("RV01", 2000.0, 0.10, 1.5);
                rv.exibirDadosOperacao();
                System.out.printf("Rendimento: R$ %.2f\n", rv.calcularRendimento());
            } 
            else if (opcao == 3) {
                System.out.println("\n-- Operação Internacional --");
                OperacaoInternacional oi = new OperacaoInternacional("INT01", 500.0, 5.20);
                oi.exibirDadosOperacao();
                System.out.printf("Valor Convertido: R$ %.2f\n", oi.calcularValorConvertido());
            } 
            else if (opcao == 4) {
                System.out.println("\n-- Investimento Internacional --");
                InvestimentoInternacional ii = new InvestimentoInternacional("INV_INT01", 3000.0, 0.08, 5.20);
                ii.exibirDadosOperacao();
                System.out.printf("Rendimento: R$ %.2f\n", ii.calcularRendimento());
                System.out.printf("Valor Convertido Inicial: R$ %.2f\n", ii.calcularValorConvertido());
            } 
            else if (opcao == 5) {
                System.out.println("Encerrando o sistema...");
            }
            else {
                System.out.println("opcao invalida. tente novamente");
            }
            
        } while (opcao != 5);
    }
}
