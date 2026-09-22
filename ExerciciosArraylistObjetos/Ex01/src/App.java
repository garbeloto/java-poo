import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario1 = new Funcionario("Carlos", "Supervisor", 6500);
        Funcionario funcionario2 = new Funcionario("Marcos", "Operador", 2000);
        Funcionario funcionario3 = new Funcionario("Ana", "Gerente", 8500);

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 3500, 15, funcionario2));
        produtos.add(new Produto("Monitor", 1200, 9, funcionario1));
        produtos.add(new Produto("Teclado", 300, 4, funcionario2));
        produtos.add(new Produto("Impressora", 1800, 0, funcionario3));
        produtos.add(new Produto("Servidor", 3500, 2, funcionario3));

        System.out.println("====TODOS PRODUTOS====");
        for (Produto produto : produtos) {
            produto.exibirInformacoes();
            System.out.println("---------------------------");
        }

        System.out.println("====TODOS PRODUTOS ABAIXO DE 10 UNIDADES====");
        for (Produto produto : produtos) {
            if (produto.quantidadeEstoque < 10) {
                System.out.println(produto.nome);
            }
            System.out.println("---------------------------");
        }

        System.out.println("====PRODUTOS COM VALOR EM ESTOQUE ACIMA DE 10000====");
        for (Produto produto : produtos) {
            if (produto.calcularValorEstoque() > 1000) {
                System.out.println(produto.nome + " - R$ " + produto.calcularValorEstoque());
            }
        }
    }
}
