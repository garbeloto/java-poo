public abstract class Cartao {
    private int numeroCartao;
    private double saldo;
    private final double tarifaBase = 5.00;

    public Cartao(int numeroCartao, double saldo) {
        this.numeroCartao = numeroCartao;
        this.saldo = saldo;
    }

    public void recarregarCartao(double valor){
        saldo += valor;
        System.out.println("Recarga de R$" + valor + " efetuada com sucesso");
    }

    public abstract double passarCatraca();

    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
