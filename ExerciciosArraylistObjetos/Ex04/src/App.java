import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Fornecedor fornecedor1 = new Fornecedor("Coca Cola", "Florianópolis");
        Fornecedor fornecedor2 = new Fornecedor("Alimentos do Campo", "Jaguaruna");
        Fornecedor fornecedor3 = new Fornecedor("Bauducco", "Criciúma");
        Fornecedor fornecedor4 = new Fornecedor("Tirol", "Bauneario Camburiu");

        ArrayList<Produto> produto = new ArrayList<>();
    
        produto.add(new Produto("Coca Cola Zero 2 Litros", 6.40, 90, fornecedor1));
        produto.add(new Produto("Coca Cola Zero 200ml", 0.5, 120, fornecedor1));
        produto.add(new Produto("Fanta Uva 2 Litros", 5.40, 90, fornecedor1));
        produto.add(new Produto("Alface", 0.90, 3, fornecedor2));
        produto.add(new Produto("Brocolis", 1.60, 4, fornecedor2));
        produto.add(new Produto("Leite UHT 1 Litro", 2.90, 100, fornecedor3));
        produto.add(new Produto("Leite Condensado Semidesnatado", 3.20, 55, fornecedor3));
        produto.add(new Produto("Biscoito de Chocolate", 5.90, 0, fornecedor4));

        System.out.println("============PRODUTOS=============");
        for (Produto p : produto) {
            p.exibirInformacoes();
            p.verificarEstoque();
            System.out.println("-----------------");
            System.out.println(" ");
        }

        
        // D) Mostrar produtos com valor total em estoque SUPERIOR A R$ 5.000,00
        System.out.println("\n========== PRODUTOS COM VALOR TOTAL > R$ 5.000,00 ==========");
        for (Produto p : produto) {
            if (p.calcularValorTotal() > 5000.0) {
                System.out.println("Produto: " + p.nome + " | Valor total em estoque: R$ " + p.calcularValorTotal());
            }
        }

        // E) Mostrar produtos fornecidos por uma DETERMINADA CIDADE (Ex: São Paulo)
        String cidadeFiltro = "São Paulo";
        System.out.println("\n========== PRODUTOS DA CIDADE: " + cidadeFiltro.toUpperCase() + " ==========");
        for (Produto p : produto) {
            if (p.fornecedor != null && p.fornecedor.cidade.equalsIgnoreCase(cidadeFiltro)) {
                p.exibirInformacoes();
            }
        }
    }
    
}
