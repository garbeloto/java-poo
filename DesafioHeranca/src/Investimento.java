public class Investimento extends Operacao{
    private double taxaRendimento;

    public Investimento(int id, double valorInicial, double taxaRendimento) {
        super(id, valorInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public double calcularRendimento(){
        return  getValorInicial() * taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }
}
