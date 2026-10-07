import java.util.ArrayList;

public class Produto {
    String nome;
    double preco;
    int quantidade;
    Fornecedor fornecedor;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidade, Fornecedor fornecedor) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    public void exibirInformacoes(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public void verificarEstoque(){
        if (quantidade == 0) {
            System.out.println("Sem estoque");
        } else if (quantidade >= 1 && quantidade <= 5 ) {
            System.out.println("Estoque crítico");
        } else if (quantidade > 5) {
            System.out.println("Estoque normal");
        } else {
            System.out.println("Quantidade inválida.");
        }
    }

    public double calcularValorTotal(){
        return preco * quantidade;
    }

    public void calcularValorEstoqueTotal(ArrayList<Produto> produtos){
        System.out.println("==========VALOR ESTOQUE TOTAL PRODUTOS==========");
        for (Produto p : produtos) {
            p.exibirInformacoes();
            p.calcularValorEstoqueTotal(produtos);

            System.out.println("----------------");
            System.out.println(" ");
        }
    }

    
}
