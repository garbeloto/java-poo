public class InvestimentoRendaFixa extends Investimento {

    public InvestimentoRendaFixa(int id, double valorInicial, double taxaRendimento) {
        super(id, valorInicial, taxaRendimento);
    }
    
    public double calcularRendimentoRendaFixa(){
        return getValorInicial() * getTaxaRendimento();
    }

    
}
