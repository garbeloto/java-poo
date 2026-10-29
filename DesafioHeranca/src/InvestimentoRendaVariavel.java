public class InvestimentoRendaVariavel extends Investimento{
    private double fatorRisco;

    public InvestimentoRendaVariavel(int id, double valorInicial, double taxaRendimento, double fatorRisco) {
        super(id, valorInicial, taxaRendimento);
        this.fatorRisco = fatorRisco;
    }

    public double calcularRendimentoRendaVariavel(){
        return getValorInicial() * getTaxaRendimento() * fatorRisco;
    }

}
