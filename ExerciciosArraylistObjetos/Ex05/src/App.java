import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        System.out.println("=== CADASTRO DE MECÂNICOS ===");
        
        // Cadastro do Mecânico 1
        System.out.print("Nome do Mecânico 1: ");
        String nomeMec1 = scanner.nextLine();
        System.out.print("Especialidade do Mecânico 1: ");
        String espMec1 = scanner.nextLine();
        Mecanico mec1 = new Mecanico(nomeMec1, espMec1);

        // Cadastro do Mecânico 2
        System.out.println("\n-----------------------------");
        System.out.print("Nome do Mecânico 2: ");
        String nomeMec2 = scanner.nextLine();
        System.out.print("Especialidade do Mecânico 2: ");
        String espMec2 = scanner.nextLine();
        Mecanico mec2 = new Mecanico(nomeMec2, espMec2);

        System.out.println("\n=== CADASTRO DE VEÍCULOS ===");
        
        // Laço para cadastrar 3 veículos
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n-- Veículo " + i + " --");
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            
            System.out.print("O veículo já está pronto? (true/false): ");
            boolean pronto = scanner.nextBoolean();
            
            // Escolhendo o mecânico
            System.out.println("Quem será o mecânico responsável?");
            System.out.println("1 - " + mec1.nome);
            System.out.println("2 - " + mec2.nome);
            System.out.println("0 - Nenhum (Ficar na fila)");
            System.out.print("Opção: ");
            int opcaoMecanico = scanner.nextInt();
            
            // Limpando o buffer do teclado (muito importante após ler números!)
            scanner.nextLine();

            // Atribuindo o objeto Mecanico com base na escolha do usuário
            Mecanico mecanicoEscolhido = null;
            if (opcaoMecanico == 1) {
                mecanicoEscolhido = mec1;
            } else if (opcaoMecanico == 2) {
                mecanicoEscolhido = mec2;
            }

            // Criando o objeto Veiculo com os dados digitados e adicionando na lista
            Veiculo novoVeiculo = new Veiculo(modelo, ano, mecanicoEscolhido, pronto);
            listaVeiculos.add(novoVeiculo);
        }

        // Exibindo todos os veículos cadastrados e seus status
        System.out.println("\n========== RELATÓRIO DA OFICINA ==========");
        for (Veiculo v : listaVeiculos) {
            v.exibirDados();
            v.verificarStatus();
            System.out.println("------------------------------------------");
        }

    }
}
