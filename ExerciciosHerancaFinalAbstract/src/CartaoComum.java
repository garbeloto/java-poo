public class CartaoComum extends Cartao{

    public CartaoComum(int numeroCartao, double saldo) {
        super(numeroCartao, saldo);
    }

    @Override //adicionar validação
    public double passarCatraca() {   
        double novoSaldo = getSaldo() - 5.00;
        setSaldo(novoSaldo);
        return novoSaldo;
    }
    
}
