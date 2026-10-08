public class Produto {
    private String nome;
    private double preco;
    private double percentualDesconto;

    public Produto(String nome, double preco, double percentualDesconto) {
        setNome(nome);
        setPreco(preco);
        setPercentualDesconto(percentualDesconto);
    }

    public void setNome(String nome) {
        if (nome != null || nome.trim().isEmpty()) {
            this.nome = nome.trim();
        } else { 
            System.out.println("Nome do produto inválido.");
        }
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public void setPercentualDesconto(double percentualDesconto) {
        if (percentualDesconto >= 0 && percentualDesconto <= 50) {
            this.percentualDesconto = percentualDesconto;
        } else {
            System.out.println("Percentual desconto inválido");
        }
    }

    public double getPrecoFinal(){
        return  preco - (preco * (percentualDesconto / 100));
    }

    /* public void isEmPromocao(){
        if (percentualDesconto > 0) {
            System.out.println("Produto possui desconto! Desconto de " + percentualDesconto + "%");
        } else { 
            System.out.println("Produto não possui desconto.");
        }
    } */

    public boolean isEmPromocao(){
        return percentualDesconto > 0;
    }

    public String getNome() {
        return nome;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public double getPreco() {
        return preco;
    }
    
}
