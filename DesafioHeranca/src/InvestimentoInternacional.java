public class InvestimentoInternacional extends Investimento {
    private double taxaConversao;

    public InvestimentoInternacional(int id, double valorInicial, double taxaRendimento, double taxaConversao) {
        super(id, valorInicial, taxaRendimento);
        setTaxaConversao(taxaConversao);
    }

    public void setTaxaConversao(double taxaConversao) {
        if (taxaConversao <= 0) {
            System.out.println("a taxa de conversão não pode ser negativa ou igual a zero");
        } else {
            this.taxaConversao = taxaConversao;
        }
    }

    public double calcularValorConvertido() {
        return getValorInicial() * taxaConversao;
    }
}
