public class ProdutoDigital extends Produto{
    private double tamanhoMB;
    private String formatoArquivo;

    public ProdutoDigital(String codigo, String nome, double preco, double tamanhoMB, String formatoArquivo) {
        super(codigo, nome, preco);
        this.tamanhoMB = tamanhoMB;
        this.formatoArquivo = formatoArquivo;
    }

    public void setTamanhoMB(double tamanhoMB) {
        if (tamanhoMB < 0) {
            System.out.println("Tamanho MB inválido");
        } else {
            this.tamanhoMB = tamanhoMB;
        }
    }

    public double calcularPrecoComDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("O percentual de desconto deve estar entre 0 e 100.");
        }
            double valorDesconto = getPreco() * (percentual / 100.0);
            double precoFinal = getPreco() - valorDesconto;
        
        return Math.max(0, precoFinal); // Garante que o cálculo jamais retorne negativo
        
    }

    public void exibirInformacoesProdutoDigital(){
        exibirInformacoes();
        System.out.println("Tamanho em MB: " + tamanhoMB);
        System.out.println("Formato arquivo: " + formatoArquivo);

    }

    public double getTamanhoMB() {
        return tamanhoMB;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

}
