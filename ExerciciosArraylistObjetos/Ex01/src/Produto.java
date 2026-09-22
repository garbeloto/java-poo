public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;
    Funcionario funcionario;

    public Produto(String nome, double preco, int quantidadeEstoque, Funcionario funcionario) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.funcionario = funcionario;
    }

    public void exibirInformacoes(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("Responsável: " + funcionario.nome);
    }

    public void verificarEstoque(){
        if (quantidadeEstoque >= 10) {
            System.out.println("Estoque suficiente!");
        } else if (quantidadeEstoque >= 1 && quantidadeEstoque <= 9) {
            System.out.println("Estoque baixo!");
        } else {
            System.out.println("Produto esgotado!");
        }
    }

    public double calcularValorEstoque(){
        return preco * quantidadeEstoque;
    }

    
}
