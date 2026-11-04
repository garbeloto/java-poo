public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }
    
    public void aplicarRendimentos(double percentual){
        double rendimento = getSaldo() * (percentual / 100);
        setSaldo(getSaldo() * rendimento);
    }

    @Override
    public double calcularTarifaMensal() {
        return 0;
    }

    
}
