public class ContaCorrente extends ContaBancaria{
    private double limiteEspecial;

    public ContaCorrente(int numero, String titular, double saldo, double limiteEspecial) {
        super(numero, titular, saldo);
        this.limiteEspecial = limiteEspecial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    @Override
    public double calcularTarifaMensal() {
       return 15.0;
    }
}
