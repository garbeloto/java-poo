public class Conta {
    private String titular;
    private double saldo;
    


    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }


    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito realizado.");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else{
            this.saldo -= valor;
            System.out.println("Saque realizado.");
        }
    }


    public String getTitular() {
        return titular;
    }


    public double getSaldo() {
        return saldo;
    }

}
