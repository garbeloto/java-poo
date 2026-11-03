public class OperacaoInternacional extends Operacao {
    private double taxaConversao;

    public OperacaoInternacional(int id, double valorInicial, double taxaConversao) {
        super(id, valorInicial);
        setTaxaConversao(taxaConversao);
    }

    public void setTaxaConversao(double taxaConversao) {
        if (taxaConversao <= 0) {
            System.out.println("A taxa de conversao não pode ser negativa ou igual a zero");
        } else {
            this.taxaConversao = taxaConversao;
        }
    }

    public double calcularValorConvertido(){
        return getValorInicial() * taxaConversao;
    }
    
}
