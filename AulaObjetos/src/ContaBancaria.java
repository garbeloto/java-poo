public class ContaBancaria {
    String titular;
    int numero;
    double saldo;

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public double consultarSaldo(){
        return saldo;
    }
}
