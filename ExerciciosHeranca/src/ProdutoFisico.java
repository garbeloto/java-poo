public class ProdutoFisico extends Produto{
    private int quantidadeEstoque;
    private double pesoKg;

    public ProdutoFisico(String codigo, String nome, double preco, int quantidadeEstoque, double pesoKg) {
        super(codigo, nome, preco);
        this.quantidadeEstoque = quantidadeEstoque;
        setPesoKg(pesoKg);
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg < 0) {
            System.out.println("O peso não pode ser negativo");
        } else {
            this.pesoKg = pesoKg;
        }
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            System.out.println("O estoque não pode ser negativo");
        } else {
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }

    public boolean vender(int quantidade){
        if (quantidade > 0 && this.quantidadeEstoque >= quantidade) {
            this.quantidadeEstoque -= quantidade;
            return true;
        } else{
            return false;
        }
    }

    public void exibirInformacoesProdutoFisico(){
        exibirInformacoes();
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("Peso em KG: " + pesoKg);
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    
}
